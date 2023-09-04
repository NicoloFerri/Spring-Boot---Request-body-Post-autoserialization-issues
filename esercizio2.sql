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

select name from ingredient;

select name,price from ingredient;

select * from ingredient 
order by name;

select * from ingredient  
order by gluten_free desc;
