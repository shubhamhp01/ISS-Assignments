create database ISSA;

use iss;

CREATE TABLE periodic_table_properties (
  Name varchar(21) DEFAULT NULL,
  Symbol varchar(6) DEFAULT NULL,
  Atomicnumber varchar(13) DEFAULT NULL,
  Atomicmass varchar(11) DEFAULT NULL,
  element_group varchar(21) DEFAULT NULL,
  OxidationStates varchar(13) DEFAULT NULL,
  property1 varchar(101) DEFAULT NULL,
  property2 varchar(131) DEFAULT NULL,
  property3 varchar(153) DEFAULT NULL,
  wrong1 varchar(145) DEFAULT NULL,
  wrong2 varchar(131) DEFAULT NULL,
  wrong3 varchar(131) DEFAULT NULL
) 



INSERT INTO periodic_table_properties (Name, Symbol, Atomicnumber, Atomicmass, element_group, OxidationStates, property1, property2, property3, wrong1, wrong2, wrong3) VALUES
('Chlorine', 'Cl', '17', '35.453', 'Halogen', 'Gas', 'corrodes nearly every metal and is toxic for every creature', 'part of the very common plastic PVC.', 'Has the form of a diatomic green gas', 'Most stars, including our Sun, generate energy by fusioning this to helium', 'lightest and simplest element and, with a ratio of 80%, is the main ingredient of the visible universe', 'contains 3 atomic isotopes'),
('Argon', 'Ar', '18', '39.0983', 'Noble gas', 'Gas', 'abundant element in our vicinity', 'cheapest and most frequently used noble gas', 'comes into operation, when an inert atmosphere is needed', 'It is nearly transparent for X-rays', 'not often used, as it is quite expensive and very toxic', 'it is an important ingredient in many valuable gemstones'),
('Potassium', 'K', '19', '39.948', 'Alkali metal', 'Solid', 'explosively reacts with water', 'several natural minerals contain it', 'It is responsible for the largest part of the normal radioactive exposure.', 'This element gives purple color when heated', 'Gas lasers are made with the help of this', 'used in semiconductor manufacturing for plasma etching, MEMs fabrication, and flat panel display production'),
('Calcium', 'Ca', '20', '40.078', 'Alkaline earth metal', 'Solid', 'grey metal', 'very important for humans and animals', 'slowly reacts with air and fiercely reacts with water', 'used extensively used in air conditioners and refrigerators', 'It is used in Flash lamps', 'It is most expensive and most dense of all the gases'),
('Scandium', 'Sc', '21', '44.9559', 'Transition metal', 'Solid', 'soft and silvery', 'first transition metal and the first rare earth element', 'It is used in high-quality, light alloys', 'shares similar properties to that of lanthanum.', 'was first detected as an emission from the radioactive decay of radium.', 'It can create exotic compounds with fluorine in laboratories'),
('Titanium', 'Ti', '22', '47.867', 'Transition metal', 'Solid', 'light, but very strong metal', 'Is is quite frequent, but hard to extract', 'It is used a lot for technical components and steels', 'It is chemically inert gas and non-toxic in nature', 'forms an unstable hydrate.', 'This element gives purple color when heated'),
('Vanadium', 'V', '23', '50.9415', 'Transition metal', 'Solid', 'soft, malleable metal', 'when exposed to air, forms a hard, protective oxide layer', 'It is mainly used in steel alloys', 'It is found in both free and in the combined state', 'It produces a bluish purple colour when electrified', 'It is commonly called limestone'),
('Chromium', 'Cr', '24', '51.9961', 'Transition metal', 'Solid', 'very hard and shiny silvery metal', 'used for plating for optical reasons and corrosion protection', 'added to steel, to make it stainless.', 'It does not react with oxygen in the air', 'Its common name is “quicksilver”', 'The metal is mainly used to manufacture jewelry, glass and different parts in electronics items'),
('Manganese', 'Mn', '25', '54.938', 'Transition metal', 'Solid', 'very common metal and is often used in alloys', 'It can be found in nature in large quantities in many minerals.', 'Its probably most famous compound is the strong oxidizing agent potassium permanganate', 'It does not react with oxygen in the air', 'used extensively used in air conditioners and refrigerators', 'Very high surface tension'),
('Iron', 'Fe', '26', '55.845', 'Transition metal', 'Solid', 'Commonly it is alloyed together with carbon and other elements, to become steel', 'essential for mammals and makes our blood red', 'mostly found in ores', 'It is found in both free and in the combined state', 'It produces a bluish purple colour when electrified', 'It is commonly called fools gold');


SELECT * FROM dbo.periodic_table_properties;

SELECT * FROM dbo.periodic_table_properties WHERE Atomicnumber<20 ORDER BY Atomicnumber DESC;

SELECT TOP 5 Atomicmass FROM dbo.periodic_table_properties;

UPDATE dbo.periodic_table_properties SET Atomicnumber=17 WHERE Name like 'Argon' ;

SELECT DISTINCT Atomicnumber from dbo.periodic_table_properties;

SELECT Atomicnumber FROM dbo.periodic_table_properties WHERE Atomicnumber=17 OR Atomicnumber=21;  

SELECT * FROM dbo.periodic_table_properties WHERE Atomicnumber=17 AND element_group='Halogen';

SELECT * FROM dbo.periodic_table_properties WHERE OxidationStates LIKE 's%';

SELECT * FROM dbo.periodic_table_properties WHERE Atomicnumber BETWEEN 16 AND 21;

SELECT * FROM dbo.periodic_table_properties WHERE element_group IN ('Halogen','Alkali metal');

SELECT element_group AS element_type from dbo.periodic_table_properties;

DELETE FROM dbo.periodic_table_properties WHERE Atomicnumber=25;
SELECT * FROM dbo.periodic_table_properties;

CREATE TABLE products (
  product_id int DEFAULT NULL,
  product_cat int DEFAULT NULL,
  product_title varchar(22) DEFAULT NULL,
  product_latitude decimal(8,6) DEFAULT NULL,
  product_longitude decimal(9,6) DEFAULT NULL,
  product_image varchar(19) DEFAULT NULL,
  product_keywords varchar(34) DEFAULT NULL
);

INSERT INTO products (product_id, product_cat, product_title, product_latitude, product_longitude, product_image, product_keywords) VALUES
(1, 4,  'Adidas', '40.737259', '-73.612213', 'adidas.png', 'Adidas,adidas'),
(2, 4,  'Bloomingdales',  '40.738461', '-73.611496', 'blomingdales.png', 'Bloomingdales,bloomingdales'),
(3, 2,  'Charlotte Russe',  '40.738209', '-73.614296', 'charlotte.webp', 'Charlotte,charlotte,charlotterusse'),
(4, 1,  'Montblanc',  '40.738045', '-73.612808', 'montblanc.png', 'montblanc,Montblanc'),
(5, 4, 'JCPenney',  '40.739529', '-73.614021', 'jcpenny.webp', 'jcpenney,JcPenney'),
(6, 5,  'Osteria Morini',  '40.738262', '-73.614288', 'osteria.webp', 'Osteria,osteria'),
(7, 3,  'AMC ',  '40.742535', '-73.615730', 'amc.webp', 'amc,Amc,AMC'),
(8, 4,  'Tillys',  '40.738197', '-73.612526', 'tillys.webp', 'tillys,Tillys'),
(9, 4,  'Zara',  '40.737049', '-73.612076', 'zara.webp', 'Zara,zara'),
(10, 1,  'BOSS',  '40.737797', '-73.612450', 'boss.png', 'BOSS,boss'),
(11, 5,  'Asian Chao', '40.738628', '-73.613464', 'asianchao.png', 'Asian,asian');


CREATE TABLE categories(
  cat_id int,
  cat_title text NOT NULL
) ;

INSERT INTO categories (cat_id, cat_title) VALUES
(1, 'Mens'),
(2, 'Womens'),
(3, 'Entertainment'),
(4, 'Unisex'),
(5, 'Dining');


SELECT * FROM categories;

SELECT products.product_id,products.product_title, categories.cat_id FROM products INNER JOIN categories ON products.product_cat=categories.cat_id;   

SELECT * FROM categories FULL OUTER JOIN products ON products.product_cat=categories.cat_id;

SELECT * FROM categories LEFT OUTER JOIN products ON products.product_cat=categories.cat_id;

SELECT * FROM categories RIGHT OUTER JOIN products ON products.product_cat=categories.cat_id;


INSERT INTO categories (cat_id, cat_title) VALUES
(6, 'Excercise');


SELECT categories.cat_id FROM categories
UNION
SELECT products.product_id FROM products;

SELECT * INTO categoriesbackup 
FROM categories;

INSERT INTO categoriesbackup (cat_id,cat_title)
SELECT products.product_cat, products.product_title FROM products;
SELECT * FROM categoriesbackup

CREATE TABLE updatedcategories (
  cat_id int PRIMARY KEY,
  cat_title text NOT NULL
) ;

CREATE TABLE productsbackups (
  product_id int PRIMARY KEY,
  product_cat int FOREIGN KEY REFERENCES updatedcategories(cat_id),
  product_title varchar(22) UNIQUE,
  product_latitude decimal(8,6) DEFAULT NULL,
  product_longitude decimal(9,6) DEFAULT NULL,
  product_image varchar(19) DEFAULT NULL,
  product_manufactureyear int CHECK(product_manufactureyear>2000),
  product_keywords varchar(34) DEFAULT NULL
);

CREATE TABLE productsbackup (
  product_id int PRIMARY KEY,
  product_cat int FOREIGN KEY REFERENCES updatedcategories(cat_id),
  product_title varchar(22) UNIQUE,
  product_latitude decimal(8,6) DEFAULT NULL,
  product_longitude decimal(9,6) DEFAULT NULL,
  product_image varchar(19) DEFAULT NULL,
  product_manufactureyear int CHECK(product_manufactureyear>2000),
  product_keywords varchar(34) DEFAULT NULL
);
SELECT * FROM productsbackups;

CREATE INDEX updatedcategoriesindexx ON updatedcategories(cat_id);

DROP TABLE productsbackup;

ALTER TABLE productsbackups
ADD product_no int IDENTITY(1,1);

CREATE VIEW PRODUCT As 
SELECT * FROM 
products;

SELECT product_cat, COUNT(product_cat) FROM products GROUP BY product_cat
HAVING COUNT(product_cat) > 2;

SELECT * FROM products where product_cat IS NULL;

CREATE TABLE categoriesnew(
  cat_id int,
  cat_title text NOT NULL
) ;

INSERT INTO categoriesnew (cat_id, cat_title) VALUES
(NULL,'Excercise');

SELECT ISNULL(cat_id,0) FROM categoriesnew;


CREATE PROCEDURE SelectAllProperties
AS
SELECT * FROM periodic_table_properties
GO;

EXEC SelectAllProperties;




