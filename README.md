# UP-Light

## Gamified Food Tracker App - GFT
-Bruger\
-Eksperter\
-Betalingsmulighed (subscription / ads / affiliate)\
-Admin

#

### UC1: Opret personligt mål
Primær Aktør: Bruger\
Sekundær Aktør: GFT\
Forudsætninger: Brugeren har oprettet en konto, er logget ind og har indtastet personlige informationer om sig selv.\
Brief: Bruger vælger et mål, vælger intensitet og trykker opret mål.

-Gamified Food Tracker App - GFT\
-Bruger\
-Eksperter\
-Betalingsmulighed (subscription / ads / affiliate)\
-Admin


### UC1: Opret personligt mål
Primær Aktør: Bruger\
Sekundær Aktør: GFT\
Forudsætninger: Brugeren har oprettet en konto, er logget ind og har indtastet personlige informationer om sig selv.\
Brief: Bruger vælger et mål, vælger intensitet og trykker opret mål.

### UC2: Registrer indtaget mad
Primær Aktør: Bruger\
Sekundær Aktør: GFT\
Forudsætninger: Brugeren har oprettet en konto, er logget ind.\
Brief: Bruger indtaster relevant oplysning om indtaget mad såsom kalorier, protein, fedt og kulhydrater.

### UC3: Beregn anbefalet kost
Primær Aktør: GFT\
Forudsætninger: Brugeren har oprettet en konto, er logget ind og har indtastet personlige informationer om sig selv. Personligt mål er oprettet.\
Brief: GFT beregner anbefalet kost baseret på brugerens personlige mål og de indtastede personlige oplysninger.

### UC4: Se stats/progress
Primær Aktør: Bruger\
Sekundær Aktør: GFT\
Forudsætninger: Brugeren har oprettet en konto, er logget ind og har mindst en gang registreret indtaget mad.\
Brief: Brugeren kan se indtastede oplysninger som grafer og søjlediagrammer, og måle sig op mod sine venner.

### UC5: Popup forslag til måltid/snack
Primær Aktør: GFT\
Sekundær Aktør: Bruger\
Forudsætninger: Brugeren har oprettet en konto, er logget ind og har oprettet personligt mål.\
Brief: GFT tjekker hvornår man sidst har registreret indtaget mad, og hvis der er gået x antal timer, popper den op med tre forslag til hvad brugeren kan indtage baseret på deres kost, med forskellige fordele, herefter kan brugeren tage et valg.

### UC6: Anbefal måltid/snack
Primær Aktør: Bruger\
Sekundær Aktør: GFT\
Forudsætninger: Brugeren har oprettet en konto, er logget ind og har oprettet personligt mål.\
Brief: Brugeren beder GFT om valgmuligheder til en snack eller et måltid, GFT tjekker brugerens mål og ud fra det anbefaler tre valgmuligheder.

### UC7: Gnoxi avatar
Primær Aktør: GFT\
Forudsætninger: Brugeren har oprettet en konto og er logget ind.\
Brief: En avatar vil være et sted på skærmen, denne avatar bliver vist på forskellige måder ud fra hvor ofte brugeren har indtastet mad, hvis brugeren er god til at indtaste mad, har gnoxien det godt, hvis brugeren glemmer at indtaste mad i 2-3 dage, dør gnoxien.

## Domæne Diagram:
![image](https://github.com/Toebzy/UP-Light/assets/113095884/33c53d28-c5d6-4d9a-92ad-1d796d5809e1)

## Klasse Diagram:
![image](https://github.com/Toebzy/UP-Light/assets/113095884/f1bd817f-971d-4106-8a51-f196122c8f4a)


# Use Case 1: Opret personlig mål
Scope: GFT\
Level: Bruger mål\
Primær Aktør: Bruger\
Sekundær Aktør: GFT

## Interesse Personer:
-Bruger: Vil gerne kunne hurtigt oprette et mål, alt efter om de ønsker vægttab, vægtøgning, vedligeholdelse eller indgå i en vegetar kost med mulighed for at se det efter.\
-GFT:  Vil gerne give muligheder eller årsag til brug af app.\
Forudsætninger: Brugeren har oprettet en konto, er logget ind og har indtastet personlige informationer om sig selv.\ 
Succes garantier: Brugeren får oprettet et mål og information vedrørende generel vejledning. 

## Main Success Scenario: 

-Bruger trykker opret mål\
-GFT til siden\   
-Bruger vælger mellem givne muligheder for mål\ 
-GFT viser valgmuligheder indenfor valgte mål\ 
-Bruger udfylder størrelse af mål og intensitet\ 
-Bruger trykker opret mål når tilfreds med valg\ 
-GFT udregner grundlæggende vejledning og viser det til bruger\ 
-Bruger trykker accepter og bliver sendt tilbage til hovedmenu\ 
-Bruger kan nu se og ændre mål under profil 


## Alternative flows: 
-Til enhver tid under processen kan brugeren annullere ved at trykke på et kryds. Dette for brugeren tilbage til hovedmenuen\ 
-Hvis bruger ikke har indtastet oplysninger om sig selv. Bliver brugeren bedt om at udfylde dem\
-Bruger kan til hver en tid ændre på sit mål, og derved starte processen forfra fra punkt 3 



## Åbne problemer: 
-Mangler indenfor omkring relevant rådgivning ift til kost og diet. 

#

Tobias Carlsen - cph-tc183@cphbusiness.dk

Christian Kortsen - cph-cc283@cphbusiness.dk

Daniel Trelborg - cph-dh216@cphbusiness.dk

Simone Toft Hansen - cph-sh575@cphbusiness.dk
