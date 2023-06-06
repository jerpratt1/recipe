BEGIN TRANSACTION;

DROP TABLE IF EXISTS recipe;

CREATE TABLE recipe (
	recipe_id SERIAL,
	recipe_title varchar(50),
	recipe_image_url varchar(500),
	recipe_description varchar(500),
	prep_time INT,
	cook_time INT,
	rest_time INT,
	serving_size INT,
	tools varchar(500),
	ingredients varchar(1500),
	instructions varchar(2500),
	notes varchar(1500),
	keywords varchar(500),
	CONSTRAINT PK_recipe PRIMARY KEY (recipe_id)
);


COMMIT TRANSACTION;