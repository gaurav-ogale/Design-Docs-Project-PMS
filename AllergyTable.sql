CREATE TABLE Public."Allergy"
(Allergy_ID text,
 Allergy_Type text,
 Allergy_Name text,
 Allergy_Allergen_source text,
Allergy_Isoforms_Partial_Sequences_Allergen text,
Allergy_Allerginicity text)


SELECT * FROM Public."Allergy";


copy public."Allergy" from 'C:\Users\CharulataO\Desktop\Allergy.csv' DELIMITER ',' csv HEADER;


SELECT * from public."Allergy";
