INSERT INTO service (id, name, description, status, created_at, updated_at) VALUES (1, 'service 1', 'service 1 description', 'ACTIVE', NOW(), NOW());
INSERT INTO service (id, name, description, status, created_at, updated_at) VALUES (2, 'service 2', 'service 2 description', 'ACTIVE', NOW(), NOW());
INSERT INTO service (id, name, description, status, created_at, updated_at) VALUES (3, 'service 3', 'service 3 description', 'ACTIVE', NOW(), NOW());
INSERT INTO service (id, name, description, status, created_at, updated_at) VALUES (4, 'service 4', 'service 4 description', 'INACTIVE', NOW(), NOW());
INSERT INTO service (id, name, description, status, created_at, updated_at) VALUES (5, 'service 5', 'service 5 description', 'ACTIVE', NOW(), NOW());


INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (1,  'Region 1',    'REGION', null);
INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (2,  'Region 2',    'REGION', null);
INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (3,  'Region 3',    'REGION', null);


INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (4,  'City 1',      'CITY',     1);
INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (5,  'City 2',      'CITY',     1);
INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (6,  'City 3',      'CITY',     1);

INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (7,  'City 4',      'CITY',     2);
INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (8,  'City 5',      'CITY',     2);
INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (9,  'City 6',      'CITY',     2);

INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (10, 'City 7',      'CITY',     3);
INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (11, 'City 8',      'CITY',     3);
INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (12, 'City 9',      'CITY',     3);


INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (13, 'District 1',  'DISTRICT', 4);
INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (14, 'District 2',  'DISTRICT', 4);
INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (15, 'District 3',  'DISTRICT', 4);

INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (16, 'District 4',  'DISTRICT', 5);
INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (17, 'District 5',  'DISTRICT', 5);
INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (18, 'District 6',  'DISTRICT', 5);

INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (19, 'District 7',  'DISTRICT', 6);
INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (20, 'District 8',  'DISTRICT', 6);
INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (21, 'District 9',  'DISTRICT', 6);

INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (22, 'District 10', 'DISTRICT', 7);
INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (23, 'District 11', 'DISTRICT', 7);
INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (24, 'District 12', 'DISTRICT', 7);

INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (25, 'District 13', 'DISTRICT', 8);
INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (26, 'District 14', 'DISTRICT', 8);
INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (27, 'District 15', 'DISTRICT', 8);

INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (28, 'District 16', 'DISTRICT', 9);
INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (29, 'District 17', 'DISTRICT', 9);
INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (30, 'District 18', 'DISTRICT', 9);

INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (31, 'District 19', 'DISTRICT', 10);
INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (32, 'District 20', 'DISTRICT', 10);
INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (33, 'District 21', 'DISTRICT', 10);

INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (34, 'District 22', 'DISTRICT', 11);
INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (35, 'District 23', 'DISTRICT', 11);
INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (36, 'District 24', 'DISTRICT', 11);

INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (37, 'District 25', 'DISTRICT', 12);
INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (38, 'District 26', 'DISTRICT', 12);
INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (39, 'District 27', 'DISTRICT', 12);


INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (40,  'Bank 1',    'BANK',    null);
INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (41,  'Bank 2',    'BANK',    null);
INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (42,  'Bank 3',    'BANK',    null);


INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (43,  'Branch 1',  'BANK_BRANCH',    40);
INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (44,  'Branch 2',  'BANK_BRANCH',    40);
INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (45,  'Branch 3',  'BANK_BRANCH',    40);

INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (46,  'Branch 4',  'BANK_BRANCH',    41);
INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (47,  'Branch 5',  'BANK_BRANCH',    41);
INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (48,  'Branch 6',  'BANK_BRANCH',    41);

INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (49, 'Branch 7',  'BANK_BRANCH',     42);
INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (50, 'Branch 8',  'BANK_BRANCH',     42);
INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (51, 'Branch 9',  'BANK_BRANCH',     42);


INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (52,  'Station 1',   'STATION',    1);
INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (53,  'Station 2',   'STATION',    1);

INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (54,  'Station 3',   'STATION',    2);
INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (55,  'Station 4',   'STATION',    2);

INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (56,  'Station 5',   'STATION',    3);
INSERT INTO static_data (id, name, static_data_type, parent_id) VALUES (57,  'Station 6',   'STATION',    3);