<!--
 ___ _            _ _    _ _    __
/ __(_)_ __  _ __| (_)__(_) |_ /_/
\__ \ | '  \| '_ \ | / _| |  _/ -_)
|___/_|_|_|_| .__/_|_\__|_|\__\___|
            |_| 
-->
![](https://docs.simplicite.io//logos/logo250.png)
* * *

`Agd` module definition
=======================

AGD
================

Prototype **Annonces-Groupes-Département**.

`AgdAdsHistoric` business object definition
-------------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `row_ref_id` link to **`AgdAds`**                            | id                                       | yes*     |           |          | Record row ID                                                                    |
| `row_idx`                                                    | int(11)                                  | yes*     | yes       |          | History record index                                                             |
| `created_by_hist`                                            | char(100)                                | yes*     |           |          | Created by                                                                       |
| `created_dt_hist`                                            | datetime                                 | yes*     |           |          | Created date                                                                     |
| `agdAdsId`                                                   | int(11)                                  | yes*     | yes       |          | -                                                                                |
| `agdAdsTitle`                                                | char(200)                                | yes      | yes       |          | -                                                                                |
| `agdAdsBeginDate`                                            | date                                     |          | yes       |          | -                                                                                |
| `agdAdsDescription`                                          | html(2000)                               |          | yes       |          | -                                                                                |
| `agdAdsTypetransaction`                                      | enum(3) using `AGDADSTYPETRANSACTION` list | yes      | yes       |          | -                                                                                |
| `agdAdsPrice`                                                | float(11, 2)                             | yes      | yes       |          | -                                                                                |
| `agdAdsStatus`                                               | enum(100) using `AGDSTATUS` list         |          | yes       |          | -                                                                                |
| `agdAdsPhoto`                                                | image                                    |          | yes       |          | -                                                                                |
| `AgdAds_AgdSites_fk` link to **`AgdSites`**                  | id                                       |          | yes       |          | -                                                                                |
| _Ref. `AgdAds_AgdSites_fk.agdSitTitle`_                      | _char(100)_                              |          |           |          | -                                                                                |
| _Ref. `AgdAds_AgdSites_fk.agdSitAdress`_                     | _char(250)_                              |          |           |          | -                                                                                |
| _Ref. `AgdAds_AgdSites_fk.AgdSites_AgdCity_fk`_              | _id_                                     |          |           |          | -                                                                                |
| _Ref. `AgdSites_AgdCity_fk.agdCtyName`_                      | _char(200)_                              |          |           |          | -                                                                                |
| _Ref. `AgdSites_AgdCity_fk.agdCtyZipcode`_                   | _char(5)_                                |          |           |          | -                                                                                |
| `agdAdsRubId` link to **`AgdRubrique`**                      | id                                       |          | yes       |          | -                                                                                |
| _Ref. `agdAdsRubId.agdRubId`_                                | _int(11)_                                |          |           |          | -                                                                                |
| _Ref. `agdAdsRubId.agdRubTitle`_                             | _char(100)_                              |          |           |          | -                                                                                |

### Lists

* `AGDADSTYPETRANSACTION`
    - `1` Type 1
    - `2` Type 2
    - `3` Type 3
* `AGDSTATUS`
    - `BRO` En brouillon
    - `CRE` Créée
    - `MOD` Modérée
    - `VAL` Validée
    - `ARC` Archivée

`AgdCty` business object definition
-----------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|

`AgdGoodDeals` business object definition
-----------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `agdGdTitle`                                                 | char(100)                                | yes*     | yes       |          | -                                                                                |
| `agdGdTheme`                                                 | char(150)                                |          | yes       |          | -                                                                                |
| `agdGdLien`                                                  | url(250)                                 |          | yes       |          | -                                                                                |
| `agdGdOrder`                                                 | int(11)                                  |          | yes       |          | -                                                                                |
| `agdGdSitId` link to **`AgdSites`**                          | id                                       |          | yes       |          | -                                                                                |
| _Ref. `agdGdSitId.agdSitTitle`_                              | _char(100)_                              |          |           |          | -                                                                                |

`AgdParamSys` business object definition
----------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|

`AgdPrfSit` business object definition
--------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `agdPrfsitPrfId` link to **`AgdProfil`**                     | id                                       | yes*     | yes       |          | -                                                                                |
| _Ref. `agdPrfsitPrfId.usr_login`_                            | _regexp(100)_                            |          |           | yes      | _Login_                                                                          |
| `agdPrfsitSitId` link to **`AgdSites`**                      | id                                       | yes*     | yes       |          | -                                                                                |
| _Ref. `agdPrfsitSitId.agdSitTitle`_                          | _char(100)_                              |          |           |          | -                                                                                |

`AgdPrfTag` business object definition
--------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `agdPrftagPrfId` link to **`AgdProfil`**                     | id                                       | yes*     | yes       |          | -                                                                                |
| _Ref. `agdPrftagPrfId.usr_login`_                            | _regexp(100)_                            |          |           | yes      | _Login_                                                                          |
| `agdPrftagTagId` link to **`AgdTag`**                        | id                                       | yes*     | yes       |          | -                                                                                |
| _Ref. `agdPrftagTagId.agdTagName`_                           | _char(150)_                              |          |           |          | -                                                                                |

`AgdProfil` business object definition
--------------------------------------

Profil

### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `agdPrfLastLogon`                                            | datetime                                 |          |           |          | -                                                                                |
| `usr_image_id`                                               | image                                    |          | yes       | yes      | Picture                                                                          |
| `agdPrfValidation`                                           | boolean                                  |          | yes       |          | -                                                                                |
| `usr_login`                                                  | regexp(100)                              | yes*     | yes       | yes      | Login                                                                            |
| `usr_first_name`                                             | char(50)                                 |          | yes       | yes      | First name                                                                       |
| `usr_last_name`                                              | char(50)                                 |          | yes       | yes      | Last name                                                                        |
| `usr_lang`                                                   | enum(3) using `LANG` list                | yes      | yes       | yes      | Language                                                                         |
| `usr_email`                                                  | email(100)                               |          | yes       | yes      | Email address                                                                    |
| `usr_cell_num`                                               | phone(20)                                |          | yes       | yes      | Mobile/cellular phone number                                                     |
| `usr_active`                                                 | enum(1) using `USER_STATUS` list         |          | yes       |          | -                                                                                |
| `agdPrfSitId` link to **`AgdSites`**                         | id                                       |          | yes       |          | -                                                                                |
| _Ref. `agdPrfSitId.agdSitTitle`_                             | _char(100)_                              |          |           |          | -                                                                                |
| `usr_home_id` link to **`View`**                             | id                                       |          | yes       |          | -                                                                                |
| _Ref. `usr_home_id.viw_name`_                                | _char(100)_                              |          |           |          | -                                                                                |
| _Ref. `AgdSites_AgdCity_fk.agdCtyName`_                      | _char(200)_                              |          |           |          | -                                                                                |
| _Ref. `AgdSites_AgdCity_fk.agdCtyZipcode`_                   | _char(5)_                                |          |           |          | -                                                                                |
| _Ref. `agdPrfSitId.AgdSites_AgdCity_fk`_                     | _id_                                     |          |           |          | -                                                                                |
| `agdPrfType`                                                 | enum(5) using `AGDPRFTYPE` list          |          | yes       |          | -                                                                                |

### Lists

* `LANG`
    - `ENU` English language
    - `FRA` French language
* `USER_STATUS`
    - `0` Disabled
    - `1` Enabled
    - `2` Pending
    - `3` Web services only
* `AGDPRFTYPE`
    - `ADMIN` Administrateur
    - `USER` Utilisateur

`AgdRubrique` business object definition
----------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `agdRubId`                                                   | int(11)                                  | yes*     | yes       |          | -                                                                                |
| `agdRubTitle`                                                | char(100)                                | yes      | yes       |          | -                                                                                |
| `agdRubOrder`                                                | int(11)                                  | yes      | yes       |          | -                                                                                |
| `agdRubIcne`                                                 | image                                    |          | yes       |          | -                                                                                |

`AgdTag` business object definition
-----------------------------------

Centre d'intérêt

### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `agdTagName`                                                 | char(150)                                | yes*     | yes       |          | -                                                                                |
| `agdTagActive`                                               | boolean                                  |          | yes       |          | -                                                                                |
| `agdTagIcne`                                                 | image                                    |          | yes       |          | -                                                                                |

`AgdCity` business object definition
------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `agdCtyCityCode`                                             | char(100)                                | yes*     | yes       |          | -                                                                                |
| `agdCtyName`                                                 | char(200)                                | yes      | yes       |          | -                                                                                |
| `agdCtyZipcode`                                              | char(5)                                  |          | yes       |          | -                                                                                |
| `agdCtyCoordonnes`                                           | geocoords                                |          | yes       |          | -                                                                                |
| `agdCtyPopulation`                                           | char(30)                                 |          | yes       |          | -                                                                                |

`AgdSites` business object definition
-------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `agdSitPhoto`                                                | image                                    |          | yes       |          | -                                                                                |
| `agdSitTitle`                                                | char(100)                                | yes*     | yes       |          | -                                                                                |
| `agdSitOtherTitle`                                           | char(250)                                |          | yes       |          | -                                                                                |
| `agdSitAdress`                                               | char(250)                                |          | yes       |          | -                                                                                |
| `AgdSites_AgdCity_fk` link to **`AgdCity`**                  | id                                       | yes      | yes       |          | -                                                                                |
| _Ref. `AgdSites_AgdCity_fk.agdCtyCityCode`_                  | _char(100)_                              |          |           |          | -                                                                                |
| _Ref. `AgdSites_AgdCity_fk.agdCtyName`_                      | _char(200)_                              |          |           |          | -                                                                                |
| _Ref. `AgdSites_AgdCity_fk.agdCtyZipcode`_                   | _char(5)_                                |          |           |          | -                                                                                |

`AgdAds` business object definition
-----------------------------------

Petites annonces

### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `agdAdsId`                                                   | int(11)                                  | yes*     | yes       |          | -                                                                                |
| `agdAdsTitle`                                                | char(200)                                | yes      | yes       |          | -                                                                                |
| `agdAdsBeginDate`                                            | date                                     |          | yes       |          | -                                                                                |
| `agdAdsDescription`                                          | html(2000)                               |          | yes       |          | -                                                                                |
| `agdAdsTypetransaction`                                      | enum(3) using `AGDADSTYPETRANSACTION` list | yes      | yes       |          | -                                                                                |
| `agdAdsPrice`                                                | float(11, 2)                             | yes      | yes       |          | -                                                                                |
| `agdAdsStatus`                                               | enum(100) using `AGDSTATUS` list         |          | yes       |          | -                                                                                |
| `agdAdsPhoto`                                                | image                                    |          | yes       |          | -                                                                                |
| `AgdAds_AgdSites_fk` link to **`AgdSites`**                  | id                                       |          | yes       |          | -                                                                                |
| _Ref. `AgdAds_AgdSites_fk.agdSitTitle`_                      | _char(100)_                              |          |           |          | -                                                                                |
| _Ref. `AgdAds_AgdSites_fk.agdSitAdress`_                     | _char(250)_                              |          |           |          | -                                                                                |
| _Ref. `AgdAds_AgdSites_fk.AgdSites_AgdCity_fk`_              | _id_                                     |          |           |          | -                                                                                |
| _Ref. `AgdSites_AgdCity_fk.agdCtyName`_                      | _char(200)_                              |          |           |          | -                                                                                |
| _Ref. `AgdSites_AgdCity_fk.agdCtyZipcode`_                   | _char(5)_                                |          |           |          | -                                                                                |
| `agdAdsRubId` link to **`AgdRubrique`**                      | id                                       |          | yes       |          | -                                                                                |
| _Ref. `agdAdsRubId.agdRubId`_                                | _int(11)_                                |          |           |          | -                                                                                |
| _Ref. `agdAdsRubId.agdRubTitle`_                             | _char(100)_                              |          |           |          | -                                                                                |

### Lists

* `AGDADSTYPETRANSACTION`
    - `1` Type 1
    - `2` Type 2
    - `3` Type 3
* `AGDSTATUS`
    - `BRO` En brouillon
    - `CRE` Créée
    - `MOD` Modérée
    - `VAL` Validée
    - `ARC` Archivée

### Custom actions

* `AGD_EXPIRE`: 

`AgdCLub` business object definition
------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `agdClubPhotomini`                                           | image                                    |          | yes       |          | -                                                                                |
| `agdClubTitle`                                               | char(150)                                | yes      | yes       |          | -                                                                                |
| `agdClubDescription`                                         | text(2000)                               |          | yes       |          | -                                                                                |
| `agdClubSiteweb`                                             | url(100)                                 |          | yes       |          | -                                                                                |
| `agdClubAdress`                                              | char(150)                                |          | yes       |          | -                                                                                |
| `agdClubCoordonnes`                                          | geocoords                                |          | yes       |          | -                                                                                |
| `agdClubPhotoplandaccs`                                      | url(200)                                 |          | yes       |          | -                                                                                |
| `agdClubSched1`                                              | time                                     |          | yes       |          | -                                                                                |
| `agdClubSched2`                                              | time                                     |          | yes       |          | -                                                                                |
| `agdClubPriodicit`                                           | char(100)                                |          | yes       |          | -                                                                                |
| `agdClubPriodedinscription`                                  | char(250)                                |          | yes       |          | -                                                                                |
| `agdClubContactEmail`                                        | email(150)                               |          | yes       |          | -                                                                                |
| `agdClubState`                                               | char(100)                                |          | yes       |          | -                                                                                |
| `agdClubBPhoto`                                              | url(200)                                 |          | yes       |          | -                                                                                |
| `agdClubId`                                                  | int(11)                                  | yes*     | yes       |          | -                                                                                |
| `agdClubPrfId` link to **`AgdProfil`**                       | id                                       |          | yes       |          | -                                                                                |
| _Ref. `agdClubPrfId.usr_login`_                              | _regexp(100)_                            |          |           | yes      | _Login_                                                                          |
| _Ref. `agdClubPrfId.usr_first_name`_                         | _char(50)_                               |          |           | yes      | _First name_                                                                     |
| _Ref. `agdClubPrfId.usr_last_name`_                          | _char(50)_                               |          |           | yes      | _Last name_                                                                      |

`AgdNews` business object definition
------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `agdNewsId`                                                  | int(11)                                  | yes*     | yes       |          | -                                                                                |
| `agdNewsTitle`                                               | char(150)                                | yes      | yes       |          | -                                                                                |
| `agdNewsDescription`                                         | html(4000)                               |          | yes       |          | -                                                                                |
| `agdNewsPhoto`                                               | image                                    |          | yes       |          | -                                                                                |
| `agdNewsDatededbut`                                          | date                                     | yes      | yes       |          | -                                                                                |
| `agdNewsDatedefin`                                           | date                                     |          | yes       |          | -                                                                                |
| `agdNewsState`                                               | char(100)                                |          | yes       |          | -                                                                                |
| `agdNewsDatesethoraires`                                     | text(150)                                |          | yes       |          | -                                                                                |
| `agdNewsClubId` link to **`AgdCLub`**                        | id                                       |          | yes       |          | -                                                                                |
| _Ref. `agdNewsClubId.agdClubId`_                             | _int(11)_                                |          |           |          | -                                                                                |
| _Ref. `agdNewsClubId.agdClubTitle`_                          | _char(150)_                              |          |           |          | -                                                                                |
| _Ref. `agdNewsClubId.agdClubDescription`_                    | _text(2000)_                             |          |           |          | -                                                                                |
| `agdNewsSitId` link to **`AgdSites`**                        | id                                       |          | yes       |          | -                                                                                |
| _Ref. `agdNewsSitId.agdSitTitle`_                            | _char(100)_                              |          |           |          | -                                                                                |
| _Ref. `agdNewsSitId.AgdSites_AgdCity_fk`_                    | _id_                                     |          |           |          | -                                                                                |
| _Ref. `AgdSites_AgdCity_fk.agdCtyName`_                      | _char(200)_                              |          |           |          | -                                                                                |
| _Ref. `AgdSites_AgdCity_fk.agdCtyZipcode`_                   | _char(5)_                                |          |           |          | -                                                                                |

`AgdClubTag` business object definition
---------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `agdClubtagClubId` link to **`AgdCLub`**                     | id                                       | yes*     | yes       |          | -                                                                                |
| _Ref. `agdClubtagClubId.agdClubTitle`_                       | _char(150)_                              |          |           |          | -                                                                                |
| _Ref. `agdClubtagClubId.agdClubId`_                          | _int(11)_                                |          |           |          | -                                                                                |
| `agdClubtagTagId` link to **`AgdTag`**                       | id                                       | yes*     | yes       |          | -                                                                                |
| _Ref. `agdClubtagTagId.agdTagName`_                          | _char(150)_                              |          |           |          | -                                                                                |

`AgdNewsTag` business object definition
---------------------------------------



### Fields

| Name                                                         | Type                                     | Required | Updatable | Personal | Description                                                                      |
|--------------------------------------------------------------|------------------------------------------|----------|-----------|----------|----------------------------------------------------------------------------------|
| `agdNewstagNewsId` link to **`AgdNews`**                     | id                                       | yes*     | yes       |          | -                                                                                |
| _Ref. `agdNewstagNewsId.agdNewsTitle`_                       | _char(150)_                              |          |           |          | -                                                                                |
| _Ref. `agdNewstagNewsId.agdNewsId`_                          | _int(11)_                                |          |           |          | -                                                                                |
| `agdNewstagTagId` link to **`AgdTag`**                       | id                                       | yes*     | yes       |          | -                                                                                |
| _Ref. `agdNewstagTagId.agdTagName`_                          | _char(150)_                              |          |           |          | -                                                                                |

`AgdAccount` external object definition
---------------------------------------




