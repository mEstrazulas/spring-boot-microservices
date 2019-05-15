INSERT INTO portal.oauth_user (username, email, password, activated)
VALUES ('admin', 'admin@admin.com', '$2a$10$r0RFDmpneBVryx.ihHK9gu6FFJQi4nTxQUqzdSTvrPpaKZMxigqpy', 1);
INSERT INTO portal.oauth_authority (name) VALUES ('ROLE_USER');
INSERT INTO portal.oauth_authority (name) VALUES ('ROLE_ADMIN');
INSERT INTO portal.oauth_user_authority (username, authority) VALUES ('admin', 'ROLE_USER');
INSERT INTO portal.oauth_user_authority (username, authority) VALUES ('admin', 'ROLE_ADMIN');
