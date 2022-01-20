-- Table: public."patient-procedure"

-- DROP TABLE public."patient-procedure";

CREATE TABLE public."patient-procedure"
(
  "Procedure_Code" text,
  "Procedure_Description" text,
  "Procedure_Is_Depricated" boolean
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public."patient-procedure"
  OWNER TO postgres;

SELECT "Procedure_Code", "Procedure_Description", "Procedure_Is_Depricated"
  FROM public."patient-procedure";


copy (select * from procedure) to '/Users/Public/procedures.csv'
delimiter E'\t' CSV HEADER;
