-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 22, 2018 at 05:48 PM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dijan`
--

-- --------------------------------------------------------

--
-- Table structure for table `deposit`
--

CREATE TABLE `deposit` (
  `AccountNo` int(11) NOT NULL,
  `Amount` int(11) NOT NULL,
  `Date` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `deposit`
--

INSERT INTO `deposit` (`AccountNo`, `Amount`, `Date`) VALUES
(1, 0, '2018-11-22 11:43:13'),
(2, 0, '2018-11-21 15:51:36'),
(2, 0, '2018-11-21 14:48:24'),
(2, 0, '2018-11-21 15:51:03'),
(2, 0, '2018-11-21 14:49:01'),
(2, 0, '2018-11-22 14:21:47'),
(2, 1000, '2018-11-22 16:29:24'),
(16, 1000, '2018-11-22 16:31:47'),
(12, 3000, '2018-11-22 16:42:26');

-- --------------------------------------------------------

--
-- Table structure for table `personal`
--

CREATE TABLE `personal` (
  `AccountNo` int(11) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Address` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `personal`
--

INSERT INTO `personal` (`AccountNo`, `Name`, `Address`) VALUES
(1, 'dijan', 'london'),
(2, 'peter', 'manchester'),
(11, 'shafeeq	', 'london'),
(12, 'Frenchie', 'Kent'),
(16, 'rae ', 'leicester');

-- --------------------------------------------------------

--
-- Table structure for table `withdraws`
--

CREATE TABLE `withdraws` (
  `AccountNo` int(11) NOT NULL,
  `Amount` int(11) NOT NULL,
  `Date` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `withdraws`
--

INSERT INTO `withdraws` (`AccountNo`, `Amount`, `Date`) VALUES
(16, 0, '0000-00-00 00:00:00'),
(2, 0, '0000-00-00 00:00:00'),
(2, 0, '0000-00-00 00:00:00'),
(16, 50, '2018-11-22 16:40:28');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `personal`
--
ALTER TABLE `personal`
  ADD PRIMARY KEY (`AccountNo`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `personal`
--
ALTER TABLE `personal`
  MODIFY `AccountNo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
