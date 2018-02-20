INSERT INTO dev_roles (id, role_name, description) VALUES (1, 'STANDARD_USER', 'Standard User - Has no admin rights');
INSERT INTO dev_roles (id, role_name, description) VALUES (2, 'ADMIN_USER', 'Admin User - Has permission to perform admin tasks');

-- USER
-- non-encrypted password: jwtpass
INSERT INTO dev_users (id, first_name, last_name, password, username) VALUES (1, 'User', 'User', '821f498d827d4edad2ed0960408a98edceb661d9f34287ceda2962417881231a', 'user.user');
INSERT INTO dev_users (id, first_name, last_name, password, username) VALUES (2, 'Admin', 'Admin', '821f498d827d4edad2ed0960408a98edceb661d9f34287ceda2962417881231a', 'admin.admin');


INSERT INTO user_roles(user_id, role_id) VALUES(1,1);
INSERT INTO user_roles(user_id, role_id) VALUES(2,1);
INSERT INTO user_roles(user_id, role_id) VALUES(2,2);