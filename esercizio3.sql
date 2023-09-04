/*
create table meal (
name varchar(255),
price double,
calories int 
);

INSERT INTO meal (name, price, calories)
VALUES ('Spaghetti Bolognese', 16.99, 600),
       ('Grilled Chicken Salad', 12.50, 350),
       ('Veggie Stir-Fry', 17.99, 400),
       ('Cheeseburger', 18.75, 700),
       ('Margherita Pizza', 11.25, 800),
       ('Salmon with Asparagus', 14.99, 450),
       ('Caesar Salad', 7.99, 320),
       ('Vegetable Curry', 15.50, 550),
       ('BBQ Ribs', 16.50, 900),
       ('Mushroom Risotto', 13.25, 600);
/*
create table ingredient(
name varchar(255),
price double,
contains_lactose boolean,
vegetarian boolean,
vegan boolean,
gluten_free boolean
);

insert into ingredient (name,price,contains_lactose,vegetarian,vegan,gluten_free)
values('Eggs',5.50, false,true,false,true),
      ('Bread',3.50,false,true,true,false),
      ('Beef Patty', 8.50,false,false,false,true),
      ('Lattuce',2.50,false,true,true,true),
      ('Yoghurt',1.50,true,true,false,true);  
 */



select * from meal 
where price<15;

select * from ingredient 
where vegetarian is true;

select * from meal
where calories>500;

select * from meal
where price >= 15 and price <= 16;

select * from ingredient 
where contains_lactose is false and gluten_free is true;

select * from meal
where price >= 15 and calories > 600;

select * from meal 
where name = 'Margherita Pizza';

select * from ingredient 
where contains_lactose is true;

select * from meal 
where price >= 20 and calories < 800;
















