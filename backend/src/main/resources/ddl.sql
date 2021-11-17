CREATE TABLE `user_info` (
                             `id` int unsigned NOT NULL AUTO_INCREMENT,
                             `name` varchar(64) NOT NULL DEFAULT '',
                             `type` varchar(64) NOT NULL DEFAULT '',
                             `telephone` varchar(40) NOT NULL DEFAULT '',
                             `gender` int NOT NULL DEFAULT '0',
                             `created_at` datetime NOT NULL,
                             `updated_at` datetime NOT NULL,
                             PRIMARY KEY (`id`),
                             UNIQUE KEY `telephone` (`telephone`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='gender ： male 0， female 1';


