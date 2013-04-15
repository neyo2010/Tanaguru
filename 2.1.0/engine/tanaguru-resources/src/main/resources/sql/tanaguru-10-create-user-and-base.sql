CREATE USER '$tgUser'@'localhost' IDENTIFIED BY '$tgPassword';

GRANT USAGE ON * . * TO '$tgUser'@'localhost' IDENTIFIED BY '$tgPassword' WITH MAX_QUERIES_PER_HOUR 0 MAX_CONNECTIONS_PER_HOUR 0 MAX_UPDATES_PER_HOUR 0 MAX_USER_CONNECTIONS 0 ;

CREATE DATABASE IF NOT EXISTS `$tgDatabase` CHARACTER SET utf8;

GRANT ALL PRIVILEGES ON `$tgDatabase` . * TO '$tgUser'@'localhost';

FLUSH PRIVILEGES;