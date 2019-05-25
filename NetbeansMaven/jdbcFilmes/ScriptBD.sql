-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Cinema
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Cinema
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Cinema` DEFAULT CHARACTER SET utf8 ;
USE `Cinema` ;

-- -----------------------------------------------------
-- Table `Cinema`.`FilmeFavorito`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Cinema`.`FilmeFavorito` (
  `idFilmeFavorito` INT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(100) NOT NULL,
  `genero` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`idFilmeFavorito`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `Cinema`.`FilmeFavorito`
-- -----------------------------------------------------
START TRANSACTION;
USE `Cinema`;
INSERT INTO `Cinema`.`FilmeFavorito` (`idFilmeFavorito`, `titulo`, `genero`) VALUES (1, 'Titanic', 'Romance');
INSERT INTO `Cinema`.`FilmeFavorito` (`idFilmeFavorito`, `titulo`, `genero`) VALUES (2, 'Matrix', 'Ação');
INSERT INTO `Cinema`.`FilmeFavorito` (`idFilmeFavorito`, `titulo`, `genero`) VALUES (3, 'Capitão América: Soldado Invernal', 'Espionagem');

COMMIT;

