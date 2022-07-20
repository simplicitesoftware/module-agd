package com.simplicite.objects.Agd;

import com.simplicite.util.*;
import com.simplicite.util.tools.*;
import java.util.*;
/**
 * Profil
 */
public class AgdProfil extends com.simplicite.objects.System.SimpleUser {
	private static final long serialVersionUID = 1L;
	
	
	@Override
	public void postLoad() {
		super.postLoad();
		final String moduleId = ModuleDB.getModuleId("ApplicationUsers");

		// Home non visible
		ObjectField f = getField("usr_home_id");
		f.setVisibility(ObjectField.VIS_NOT);

		// Module non visible + valeur par défaut
		f = getField("row_module_id");
		f.setVisibility(ObjectField.VIS_NOT);
		f.setDefaultValue(moduleId);

		// Etat non visible
		getField("usr_active").setVisibility(ObjectField.VIS_NOT);
		// pas de sous-menu des états
		setMenuStates(false);

		// Autres valeurs par défaut
		f = getField("usr_menu", false);
		if (f != null)
			f.setDefaultValue(Tool.TRUE);
		f = getField("usr_menu_defcollapsed", false);
		if (f != null)
			f.setDefaultValue(Tool.FALSE);

		// Attributs obligatoires
		getField("usr_first_name").setRequired(true);
		getField("usr_last_name").setRequired(true);
		getField("usr_email").setRequired(true);

		// Filtrage des users du module
		setSearchSpec("t.row_module_id = " + moduleId);
	}
	
	@Override
	public List<String> preValidate() {
		super.preValidate();
		getField("usr_active").setValue("1"); // Force le statut à actif
		ObjectField profil = getField("agdPrfType");
		String p = profil.getValue();
		String vw = "ADMIN".equals(profil.getValue())?"AgdAdmin":"AgdUser";
		Grant g = getGrant();
		if (profil.hasChanged() && !"public".equals(getFieldValue("usr_login"))) {
			String viewId = View.getViewId(vw);
			setFieldValue("usr_home_id", viewId);
		}
		return null;
	}
	
	@Override
	public String postSave() {
		ObjectField profil = getField("agdPrfType");
		Grant g = getGrant();
		if (profil.hasChanged() && !"public".equals(getFieldValue("usr_login"))) {
			// Supprime toutes les responsibilités existantes
			Grant.removeAllResponsibilities(getRowId());
			// Cree la nouvelle responsabilité
			Grant.addResponsibility(getRowId(), getGroupe(profil.getValue()));
		}
		return null;
	}
	
	private String getGroupe(String profil) {
		return "AGD_" + profil;
	}
}
