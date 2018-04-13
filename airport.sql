-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 13, 2018 at 02:12 PM
-- Server version: 10.1.31-MariaDB
-- PHP Version: 7.2.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `airport`
--

-- --------------------------------------------------------

--
-- Table structure for table `ind`
--

CREATE TABLE `ind` (
  `UID` int(11) NOT NULL,
  `Name` varchar(45) NOT NULL,
  `Email ID` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ind`
--

INSERT INTO `ind` (`UID`, `Name`, `Email ID`) VALUES
(1, 'akash', 'akash.dholaria@sitpune.edu.in');

-- --------------------------------------------------------

--
-- Table structure for table `ind106`
--

CREATE TABLE `ind106` (
  `UID` int(11) NOT NULL,
  `Name` varchar(45) NOT NULL,
  `Email ID` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ind106`
--

INSERT INTO `ind106` (`UID`, `Name`, `Email ID`) VALUES
(1, 'gauri', 'gauri.nigam@sitpune.edu.in'),
(2, 'Bhoomika', 'bhoomika.jethwani@sitpune.edu.in');

-- --------------------------------------------------------

--
-- Table structure for table `jet-506`
--

CREATE TABLE `jet-506` (
  `UID` int(10) NOT NULL,
  `Name` varchar(45) NOT NULL,
  `Email ID` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jet-506`
--

INSERT INTO `jet-506` (`UID`, `Name`, `Email ID`) VALUES
(1, 'akash', 'akash.dholaria@sitpune.edu.in'),
(2, 'naman', 'naman.sharma@sitpune.edu.in');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `UID` int(10) NOT NULL,
  `Username` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`UID`, `Username`, `Password`) VALUES
(1, 'akash', 'akash'),
(2, 'bhoomika', 'bhoomika'),
(3, 'gauri', 'gauri'),
(4, 'naman', 'naman');

-- --------------------------------------------------------

--
-- Table structure for table `vis-306`
--

CREATE TABLE `vis-306` (
  `UID` int(10) NOT NULL,
  `Name` varchar(45) NOT NULL,
  `Email ID` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `vis-306`
--

INSERT INTO `vis-306` (`UID`, `Name`, `Email ID`) VALUES
(1, 'bhoomika', 'bhoomika.jethwani@sitpune.edu.in'),
(2, 'naman', 'naman.sharma@sitpune.edu.in');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
