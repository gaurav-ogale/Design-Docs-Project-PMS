-- Table: public.allergies

-- DROP TABLE public.allergies;

CREATE TABLE public.allergies
(
  allergy_id text NOT NULL,
  allergy_type text,
  allergy_name text,
  allergy_allergen_source text,
  allergy_isoforms_partial_sequences_allergen text,
  allergy_allerginicity text,
  CONSTRAINT "Allergy_pkey" PRIMARY KEY (allergy_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.allergies
  OWNER TO postgres;

copy (select * from allergies) to '/Users/Public/allergies.csv'
delimiter E'\t' CSV HEADER;