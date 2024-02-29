INSERT INTO "COUNTRY" VALUES
(1, 1, 'INDIA'),
(2, 1, 'AUSTRIA'),
(3, 1, 'US'),
(4, 1, 'GERMANY'),
(5, 1, 'ITALY)');


INSERT INTO `users` (userid,username,password,role,first_name,last_name,email)
SELECT 10,'admin',
'$2a$10$MwGZcyxNg0LVvWlPjRD10OXWS3axwvaYdB4Bf9v38aWuURQy1yh0O',
'ADMIN','firstname','lname','admin@gmail.com' WHERE NOT EXISTS (SELECT * FROM users WHERE userid=10);


INSERT INTO `users` (userid,username,password,role,first_name,last_name,email)
SELECT 11,'administrator',
'$2a$10$MwGZcyxNg0LVvWlPjRD10OXWS3axwvaYdB4Bf9v38aWuURQy1yh0O',
'ADMIN','firstname','lname','admin@gmail.com' WHERE NOT EXISTS (SELECT * FROM users WHERE userid=11);