-- MySQL dump 10.13  Distrib 8.0.32, for Linux (x86_64)
--
-- Host: localhost    Database: Quimica
-- ------------------------------------------------------
-- Server version	8.0.33-0ubuntu0.22.04.2

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Admin`
--

DROP TABLE IF EXISTS `Admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Admin` (
  `Nombre` varchar(80) NOT NULL,
  `Contraseña` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Admin`
--

LOCK TABLES `Admin` WRITE;
/*!40000 ALTER TABLE `Admin` DISABLE KEYS */;
INSERT INTO `Admin` VALUES ('Erick','Hola');
/*!40000 ALTER TABLE `Admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Historial`
--

DROP TABLE IF EXISTS `Historial`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Historial` (
  `id` int NOT NULL AUTO_INCREMENT,
  `Fecha_I` date NOT NULL,
  `Fecha_F` date DEFAULT NULL,
  `Nombre` varchar(100) NOT NULL,
  `Matricula` varchar(10) NOT NULL,
  `id_Material` int NOT NULL,
  `Cantidad` int NOT NULL,
  `Devuelto` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_Material` (`id_Material`),
  CONSTRAINT `Historial_ibfk_1` FOREIGN KEY (`id_Material`) REFERENCES `Material` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Historial`
--

LOCK TABLES `Historial` WRITE;
/*!40000 ALTER TABLE `Historial` DISABLE KEYS */;
INSERT INTO `Historial` VALUES (1,'2020-03-03',NULL,'Erick','210170017',1,5,0),(2,'2020-10-10',NULL,'Erick','2101F0017',94,9,0);
/*!40000 ALTER TABLE `Historial` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Material`
--

DROP TABLE IF EXISTS `Material`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Material` (
  `id` int NOT NULL AUTO_INCREMENT,
  `Nombre` text NOT NULL,
  `Tipo` varchar(80) NOT NULL,
  `Marca` varchar(80) NOT NULL,
  `Modelo` varchar(80) NOT NULL,
  `Serie` varchar(80) NOT NULL,
  `Cantidad` int NOT NULL,
  `Ubicacion` text NOT NULL,
  `Especificaciones` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=95 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Material`
--

LOCK TABLES `Material` WRITE;
/*!40000 ALTER TABLE `Material` DISABLE KEYS */;
INSERT INTO `Material` VALUES (1,'FRASCO AMBAR BOCA ANCHA 250 ML','Cristal','SD','SD','SD',24,'LABORATORIO DE QUIMICA','VIDRIO COLOR AMBAR'),(2,'KIT MATRAZ ERLENMEYER GRADUADO 50, 125, 250, 500 Y 1000 ML','Cristal','PYREX','SD','SD',2,'LABORATORIO DE QUIMICA','VIDRIO'),(3,'KIT PROBETA 10, 25, 50, 100 Y 250 ML','Cristal','KIMAX','SD','SD',2,'LABORATORIO DE QUIMICA','VIDRIO, GRADUADO'),(4,'MATRAZ FLORENCIA250 ML ','Cristal','PYREX','SD','SD',1,'LABORATORIO DE QUIMICA','VIDRIO'),(5,'MATRAZ KITAZATO PARA FILTRACION 250 ML','Cristal','KIMAX','SD','SD',2,'LABORATORIO DE QUIMICA','VIDRIO, CON CONEXÍON PARA TUBO DE LATEX'),(6,'PIPETA SEROLOGICA 7085-10X1','Cristal','PYREX','SD','SD',5,'LABORATORIO DE QUIMICA','VIDRIO, GRADUADA'),(7,'VASO DE PRECIPITADO  100 ML','Cristal','KIMAX','SD','SD',2,'LABORATORIO DE QUIMICA','VIDRIO'),(8,'VASO DE PRECIPITADO  250 ML','Cristal','KIMAX','SD','SD',2,'LABORATORIO DE QUIMICA','VIDRIO'),(9,'VASO DE PRECIPITADOS 50 ML','Cristal','KIMAX','SD','SD',2,'LABORATORIO DE QUIMICA','VIDRIO'),(10,'VASO DE PRECIPITADO DE VIDRIO 1000 ML','Cristal','KIMAX','SD','SD',2,'LABORATORIO DE QUIMICA','VIDRIO'),(11,'VASO DE PRECIPITADO DE VIDRIO 600 ML','Cristal','KIMAX','SD','SD',2,'LABORATORIO DE QUIMICA','VIDRIO'),(12,'BURETA GRADUADA 50 ML','Cristal','CIVEQ','SD','SD',4,'LABORATORIO DE QUIMICA','CRISTAL, GRADUADA'),(13,'EMBUDO ESTIRADO 60° 65 MM','Cristal','PYREX','SD','SD',5,'LABORATORIO DE QUIMICA','VIDRIO'),(14,'TUBO DE CULTIVO S/LABIO, PQT CON 249 PZAS','Cristal','PYREX','SD','SD',1,'LABORATORIO DE QUIMICA','CRISTAL'),(15,'KIT DE CILINDRO GRADUADO CLASE B  10, 25, 50, 100 Y 250 ML','Cristal','KIMAX','20024-01','SD',2,'LABORATORIO DE QUIMICA','DE VIDIRO, CON GRADUACIÓN '),(16,'MATRAZ VOLUMETRICO DE VIDRIO BORISILICATO CON TAPÓN DE PP.  250 ML','Cristal','SD','SD','SD',2,'LABORATORIO DE QUIMICA','CUELLO LARGO'),(17,'PAQUETE VARIADO DE MATRAZ ERLENMEYER  DE 50, 125, 250, 500 Y 1 L','Cristal','CORNING','SD','SD',3,'LABORATORIO DE QUIMICA','VIDRIO'),(18,'MATRAZ VOLUMETRICO DE VIDRIO CON TAPA DE VIDRIO DE 250 ML','Cristal','PYREX','5640-250','SD',6,'LABORATORIO DE QUIMICA','CUELLO LARGO'),(19,'MATRAZ DE FILTRADO DE 500 ML','Cristal','PYREX','5340-500','SD',3,'LABORATORIO DE QUIMICA','VIDRIO CON CONEXIÓN PARA TUBO DE LATEX'),(20,'PORTAOBJETOS DIAMANTADO CAJA C/50 ','Cristal','SD','2947-25X75','SD',20,'LABORATORIO DE QUIMICA','VIDRIO, EN CAJA BLANCA'),(21,'MATRAZ DE EBULLICIÓN FONDO REDONDO','Cristal','PYREX','SD','SD',6,'LABORATORIO DE QUIMICA','DE VIDRIO'),(22,'BOTELLAS DE VIDRIO AMBAR DE BOCA ANGOSTA DE 250 ML','Cristal','THERMO SCIENTIFIC','329-250','SD',12,'LABORATORIO DE QUIMICA','VIDRIO COLOR AMBAR, TAPA CHICA'),(23,'VIDRIO DE RELOJ 100MM','Cristal','PYREX','SD','SD',10,'LABORATORIO DE QUIMICA','VIDRIO CÓNCAVO'),(24,'EMBUDO DE VIDRIO PARA FILTRADO KIMEX DE 55 MM DE DIAM. SUPERIOR','Cristal','KIMBLE CHASE','28950-55','SD',12,'LABORATORIO DE QUIMICA','VIIDRIO'),(25,'CUBREOBJETOS, CAJA C/100','Cristal','SD','2865-22X22','SD',10,'LABORATORIO DE QUIMICA','EN CAJA PROTECTORA'),(26,'VIDRIO DE RELOJ 100MM','Cristal','UNITED SCIENTIFIC','SD','SD',12,'LABORATORIO DE QUIMICA','VIDRIO CÓNCAVO'),(27,'FRASCO TARRO DE BOCA ANCHA DE 250 ML','Cristal','SD','5220845C21','SD',10,'LABORATORIO DE QUIMICA','VIDRIO COLOR AMBAR'),(28,'CRSITALIZADOR 180 ml','Cristal','PYREX','3140-80X40','SD',5,'LABORATORIO DE QUIMICA','DE VIDRIO, DE 3 CM DE ALTURA'),(29,'PINZA PARA MATRAZ','Metal_Gas','SD','SD','SD',2,'LABORATORIO DE QUIMICA','PINZA DE METAL'),(30,'ESTADAL DE ALUMINIO TELESCOPICO 4m.','Metal_Gas','SD','SD','SD',4,'LABORATORIO DE QUIMICA','EN FUNDA ROJA DE LONA'),(31,'MICROTOMO CON NAVAJA ','Metal_Gas','SD','HM1/HM1A','SD',3,'LABORATORIO DE QUIMICA','DE METAL CON SUPERFICIE DE CERAMICA, EN CAJA BLANCA'),(32,'MECHERO FISHER ALTA TEMPERATURA','Metal_Gas','SD','SD','SD',5,'LABORATORIO DE QUIMICA','METAL'),(33,'SOPORTE UNIVERSAL CON VARILLA DE 60 CMS','Metal_Gas','CIVEQ','CVQ-0012','SD',5,'LABORATORIO DE QUIMICA','DE ACERO, CON VARILLA CROMADA'),(34,'SOPORTE RECTANGULAR CON BASE DE ACERO Y VARILLA DE 36 X 1/2 \"','Metal_Gas','DAIGGER','EF23185F','SD',5,'LABORATORIO DE QUIMICA','DE ACERO, CON VARILLA CROMADA'),(35,'TRIPIE DE FIERRO DESMONTABLE','Metal_Gas','CIVEQ','SD','SD',5,'LABORATORIO DE QUIMICA','DE FIERRO, CON PATAS PARA ENSAMBLAR'),(36,'MECHERO TIPO TIRRIL','Metal_Gas','SD','SD','SD',5,'LABORATORIO DE QUIMICA','METAL'),(37,'SOPORTE DE TRIPIE CON ANILLO O DE 6\"','Metal_Gas','UNITED SCIENTIFIC SUPPLY','H24160','SD',5,'LABORATORIO DE QUIMICA','ANILLO DE METAL CON PATAS DE ACERO'),(38,'TELA DE ALAMBRE CENTRO DE CERÁMICA ','Metal_Gas','QUIVEQ','SD','SD',10,'LABORATORIO DE QUIMICA','MALLA DE METAL CON CENTRO DE CERAMICA'),(39,'PICETA DE POLIPROPILENO 500 ML','Polimero','SD','SD','SD',7,'LABORATORIO DE QUIMICA','DE PLÁSTICO TRANSPARENTE'),(40,'PINZA DOBLE PARA BURETA ','Polimero','CIVEQ','CVQ-0126','SD',5,'LABORATORIO DE QUIMICA','PLÁSTICO BLANCO'),(41,'TUBO DE HULE LATEX AMBAR PARA MECHERO 6MM/9MM, CAJA 15 METROS','Polimero','XTEVQ','SD','SD',4,'LABORATORIO DE QUIMICA','MANGUERA DE LATEX EN CAJA'),(42,'SOPORTE PARA EMBUDO BUCHNER, PAQUETE CON 7 SOPORTES DE NEOPRENO','Polimero','DYNALON','242864-0000','SD',4,'LABORATORIO DE QUIMICA','GRIS, DE NEOPRENO'),(43,'CAJA DE POLIPROPILENO PARA TRANSPORTE DE PORTAOJETOS','Polimero','SD','SD','SD',2,'LABORATORIO DE QUIMICA','DE PLÁSTICO, AZUL'),(44,'FRASCO LAVADOR DE 500 ML','Polimero','SD','SD','SD',5,'LABORATORIO DE QUIMICA','DE PLÁSTICO TRANSPARENTE'),(45,'EMBUDO BUCHNER','Porcela','DUBE CAT','CVQ-3090','SD',5,'LABORATORIO DE QUIMICA','DE PORCELANA, BLANCO'),(46,'CÁPSULA DE PORCELANA DE 100 ML','Porcela','SD','SD','SD',4,'LABORATORIO DE QUIMICA','BLANCA, DE PORCELANA'),(47,'EMBUDO BUCHNER DE PORCELANA 63MM ANCHO 101 MM ALTO','Porcela','COORSTEK','602040','SD',4,'LABORATORIO DE QUIMICA','DE PORCELANA, BLANCO'),(48,'MORTERO DE PORCELANA 20 ML CON PISTILO','Porcela','SD','SD','SD',5,'LABORATORIO DE QUIMICA','CERÁMICA BLANCA'),(49,'CÁPSULA DE PORCELANA 70 ML','Porcela','COORS TEK','60197','SD',3,'LABORATORIO DE QUIMICA','BLANCA, DE PORCELANA'),(50,'CENTRIFUGA UNIVERSAL CLINICA DIGITAL DE 8 TUBOS','Equipo_Electrico','VELAB','VE-4000','SD',1,'LABORATORIO DE QUIMICA','PLASTICO BLANCA Y AZUL'),(51,'TEODOLITO ELECTRONICO CON TRIPIE','Equipo_Electrico','SOUTH','ET05','G001-J003-D004',1,'LABORATORIO DE QUIMICA','EN ESTUCHE ROJO, COLO AMARILLO'),(52,'MICROSCOPIO TRINOCULAR','Equipo_Electrico','SD','86041','SD',4,'LABORATORIO DE QUIMICA','DE METAL, BLANCO CON FUNDA'),(53,'PARRILLA CON AGITACION','Equipo_Electrico','CORNING','PC-620D','SD',3,'LABORATORIO DE QUIMICA','SD'),(54,'MICROSCOPIO BINOCULAR BIOLOGICO','Equipo_Electrico','VELAB MICROSCOPES','VE-B1','150128-119',3,'LABORATORIO DE QUIMICA','BLANCO CON AZUL, CON FUNDA DE PLASTICO'),(55,'BALANZA PORTATIL DE 600gr.','Equipo_Electrico','OHAUS','SP601','8336028191',3,'LABORATORIO DE QUIMICA','PORTATIL CON CABLE '),(56,'MEDIDOR DE PH IMPERMEABLE','Equipo_Electrico','HANNA INSTRUMENTS','HI98128','SD',4,'LABORATORIO DE QUIMICA','EN CAJA, COLOR ROJO DE PLASTICO'),(57,'MICROSCOPIO ESTEREOSCOPICO','Equipo_Electrico','KONUS','AMBER 5033','SD',6,'LABORATORIO DE QUIMICA','COLOR AMBAR, DE PLASTICO,  DE BATERÍAS, PEQUEÑO'),(58,'AGITADOR MAGNETICO','Material_Imantado','SCIENTIFIC','CVP-3250C','201501066',3,'LABORATORIO DE QUIMICA','BLANCO, DE PLASTICO'),(59,'BARRAS MAGNETICAS DE AGITACION 1/2\" X 5/16\"','Material_Imantado','SPINBAR','SD','SD',10,'LABORATORIO DE QUIMICA','DE TEFLÓN, EN PAQUETE'),(60,'BARRA DE AGITACIÓN  MAGNETICA OCTAGONAL','Material_Imantado','VWR','SD','SD',10,'LABORATORIO DE QUIMICA','TEFLON GRIS, EN SU PAQUETE'),(61,'GUANTE DE ASBESTO','Seguridad','NACIONAL','SD','SD',4,'LABORATORIO DE QUIMICA','AZUL CLARO, DE TELA'),(62,'GAFAS DE SEGURIDAD','Seguridad','SD','SD','SD',16,'LABORATORIO DE QUIMICA','MICA TRANSPARENTE CON ARMAZON AZUL,BLANCO Y ROJO'),(63,'GOGLE LENTE DE SEGURIDAD TIPO MEDICAL','Seguridad','SD','SD','SD',30,'LABORATORIO DE QUIMICA','MICA RESISTENTE COMPLETAMENTE TRANSPARENTES'),(64,'MANDIL ','Seguridad','SD','SD','SD',3,'LABORATORIO DE QUIMICA','MANDIL DE VINIL BLANCO'),(65,'KIT PARA ANALISIS DE SUELOS','Sustancias','LAMOTT','STH-14','SD',1,'LABORATORIO DE QUIMICA','MALETIN NEGRO DURO'),(66,'AZUL DE TOLOUIDINA DE 25 GR','Sustancias','CIVEQ','SD','SD',1,'LABORATORIO DE QUIMICA','BOTELLA CON ETIQUETA'),(67,'SULFATO MANGANOSO MONOHIDRATADO, 500 GR','Sustancias','FREEMONT','SD','SD',1,'LABORATORIO DE QUIMICA','EN FRASCO CON ETIQUETA'),(68,'ACIDO BORICO, SOL AL 1%','Sustancias','HYCEL','SD','SD',1,'LABORATORIO DE QUIMICA','BOTELLA CON ETIQUETA'),(69,'ACIDO NÍTRICO AL 64 - 66%,  1 LT','Sustancias','FREEMONT','SD','SD',1,'LABORATORIO DE QUIMICA','BOTELLA CON ETIQUETA'),(70,'VIOLETA CRISTAL GENCIANA EC, 100 GR ','Sustancias','CIVEQ','SD','SD',1,'LABORATORIO DE QUIMICA','EN FRASCO CON ETIQUETA'),(71,'HIDROXIDO DE SODIO, 500 GR','Sustancias','FREEMONT','SD','SD',1,'LABORATORIO DE QUIMICA','EN FRASCO CON ETIQUETA'),(72,'HIDROXIDO DE SODIO, 500 GR','Sustancias','FREEMONT','SD','SD',1,'LABORATORIO DE QUIMICA','EN FRASCO CON ETIQUETA'),(73,'SAFRANINA SOL ACUOSA 1%, 500 ML','Sustancias','CIVEQ','SD','SD',1,'LABORATORIO DE QUIMICA','EN FRASCO CON ETIQUETA'),(74,'EOSINA AMARILLENTA SOL. 1% OH, 500 ML','Sustancias','CIVEQ','SD','SD',1,'LABORATORIO DE QUIMICA','EN FRASCO CON ETIQUETA'),(75,'VERDE BRILLANTE, SOL ACUOSA 1% 500 ML','Sustancias','HYCEL','SD','SD',1,'LABORATORIO DE QUIMICA','EN FRASCO CON ETIQUETA'),(76,'AZUL DE METILENO SOL ACUOSA 1%','Sustancias','CIVEQ','SD','SD',1,'LABORATORIO DE QUIMICA','BOTELLA CON ETIQUETA'),(77,'NARANJA METILO 0.05 0.1%, 500 ML','Sustancias','HYCEL','SD','SD',1,'LABORATORIO DE QUIMICA','EN FRASCO CON ETIQUETA'),(78,'NITRATO DE CALCIO','Sustancias','SD','SD','SD',1,'LABORATORIO DE QUIMICA','EN FRASCO CON ETIQUETA'),(79,'HIERRO (III) CLORURO HEXAHIDRATO','Sustancias','SD','SD','SD',1,'LABORATORIO DE QUIMICA','EN FRASCO CON ETIQUETA'),(80,'MAGNESIO EN CINTA','Sustancias','SD','SD','SD',1,'LABORATORIO DE QUIMICA','MAGNESIO EN CINTA 0.15 A 0.30 MM DE ESPESOR 3MM'),(81,'ACIDO SALICILICO','Sustancias','SD','SD','SD',1,'LABORATORIO DE QUIMICA','ACIDO SALISILICO, GRADO U.S.P. ANHIDRIDO'),(82,'FIERRO METALICO','Sustancias','SD','SD','SD',1,'LABORATORIO DE QUIMICA','REACTIVO EN FORMA DE POLVO'),(83,'ESCOBILLON PARA BURETA 65X15X1.5','Limpieza','SD','SD','SD',5,'LABORATORIO DE QUIMICA','S/D'),(84,'ESCOBILLON PARA TUBO DE ENSAYO 15X7X1.5','Limpieza','SD','SD','SD',3,'LABORATORIO DE QUIMICA','S/D'),(85,'ESCOBILLÓN PARA MATRAZMED 37X11X15','Limpieza','SD','SD','SD',12,'LABORATORIO DE QUIMICA','S/D'),(86,'PAPEL PARAFILM 10 CM X 38 METROS','Consumibles','SD','SD','SD',1,'LABORATORIO DE QUIMICA','CAJA DISPENSADORA'),(87,'PAPEL FILTRO #1 12.5 CM C/100 PZAS','Consumibles','WHATMAN','SD','SD',1,'LABORATORIO DE QUIMICA','EN CAJA'),(88,'PAPEL FILTRO #1 12.5 CM C/100 PZAS','Consumibles','WHATMAN','SD','SD',1,'LABORATORIO DE QUIMICA','EN CAJA'),(89,'PAPEL FILTRO 12.5 CM, DE 11 MICRAS, PAQ. CON 100 PIEZAS','Consumibles','WHATMAN','1001-125','SD',1,'LABORATORIO DE QUIMICA','EN CAJA'),(90,'PAPEL INDICADOR DE PH -14, CON 100 TIRAS','Consumibles','FREEMONT','SD','SD',1,'LABORATORIO DE QUIMICA','CAJA DISPENSADORA DE PLÁSTICO'),(91,'PAPEL INDICADOR DE PH -14, CON 100 TIRAS','Consumibles','FREEMONT','SD','SD',1,'LABORATORIO DE QUIMICA','CAJA DISPENSADORA DE PLÁSTICO'),(94,'Comida','uyghfj','55654687a','842','asdasdasda',50555,'Comida','Comida');
/*!40000 ALTER TABLE `Material` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Personal`
--

DROP TABLE IF EXISTS `Personal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Personal` (
  `id` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(80) NOT NULL,
  `Matricula` varchar(10) NOT NULL,
  `Cargo` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Personal`
--

LOCK TABLES `Personal` WRITE;
/*!40000 ALTER TABLE `Personal` DISABLE KEYS */;
/*!40000 ALTER TABLE `Personal` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-08-27 19:48:44
