DROP TABLE IF EXISTS player;

CREATE TABLE player (
id INT AUTO_INCREMENT PRIMARY KEY,
player_name VARCHAR(100) NOT NULL
);

INSERT INTO player (player_name) VALUES ('Player1');
INSERT INTO player (player_name) VALUES ('Player2');
