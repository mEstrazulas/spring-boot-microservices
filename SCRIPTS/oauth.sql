CREATE TABLE oauth_user (
  username VARCHAR2(50) NOT NULL PRIMARY KEY,
  email VARCHAR2(50),
  password VARCHAR2(500),
  activated NUMBER(1) DEFAULT 0,
  activationkey VARCHAR2(50) DEFAULT NULL,
  resetpasswordkey VARCHAR2(50) DEFAULT NULL
);

CREATE TABLE oauth_authority (
  name VARCHAR2(50) NOT NULL PRIMARY KEY
);

CREATE TABLE oauth_user_authority (
    username VARCHAR2(50) NOT NULL,
    authority VARCHAR2(50) NOT NULL,
    FOREIGN KEY (username) REFERENCES portal.oauth_user (username),
    FOREIGN KEY (authority) REFERENCES portal.oauth_authority (name),
    CONSTRAINT user_authority_idx_1 UNIQUE (username, authority)
);

CREATE TABLE oauth_access_token (
  token_id VARCHAR2(256) DEFAULT NULL,
  token BLOB,
  authentication_id VARCHAR2(256) DEFAULT NULL,
  user_name VARCHAR2(256) DEFAULT NULL,
  client_id VARCHAR2(256) DEFAULT NULL,
  authentication BLOB,
  refresh_token VARCHAR2(256) DEFAULT NULL
);

CREATE TABLE oauth_refresh_token (
  token_id VARCHAR2(256) DEFAULT NULL,
  token BLOB,
  authentication BLOB
);

CREATE TABLE oauth_client_details (
  client_id VARCHAR2(255) PRIMARY KEY,
  resource_ids VARCHAR2(255),
  client_secret VARCHAR2(255),
  scope VARCHAR2(255),
  authorized_grant_types VARCHAR2(255),
  web_server_redirect_uri VARCHAR2(255),
  authorities VARCHAR2(255),
  access_token_validity NUMBER(10),
  refresh_token_validity NUMBER(10),
  additional_information VARCHAR2(4000),
  autoapprove VARCHAR2(255)
);