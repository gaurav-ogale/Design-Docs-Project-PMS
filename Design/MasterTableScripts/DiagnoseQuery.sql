


CREATE TABLE DIAGNOSE_MASTER (
	DIAGNOSE_ID int CONSTRAINT DIAGNOSE_ID_PK PRIMARY KEY, 
	DESCRIPTION text 
);

CREATE TABLE DIAGNOSE_DATA (
	DIAGNOSE_CODE text,  
	DIAGNOSE_DESCRIPTION text,
	DIAGNOSE_ID int,
    CONSTRAINT FK_DIAGNOSE_ID
      FOREIGN KEY(DIAGNOSE_ID) 
	  REFERENCES DIAGNOSE_MASTER(DIAGNOSE_ID)	
);



SELECT diagnose_id, description
	FROM public.diagnose_master;
	
copy diagnose_master(diagnose_id, description)
from '/Users/Public/Diagnose_Master.csv'
CSV HEADER;





SELECT diagnose_code, diagnose_description, diagnose_id
	FROM public.diagnose_data;
	
	
copy diagnose_data(diagnose_code, diagnose_description,diagnose_id)
from '/Users/Public/Diagnose_Data.csv'
CSV HEADER;