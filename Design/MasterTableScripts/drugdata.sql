create table drugproductdata(
	ApplNo INTEGER ,
	ProductNo INTEGER,	
	Form text ,
	Strength text ,
	ReferenceDrug INTEGER,
	DrugName text,
	ActiveIngredient text,
	ReferenceStandard INTEGER DEFAULT 0
);

copy drugproductdata(ApplNo,ProductNo,Form,Strength,ReferenceDrug,DrugName,ActiveIngredient,ReferenceStandard)
from '/Users/Public/Products.txt'
delimiter E'\t' CSV HEADER;

select * from drugproductdata;