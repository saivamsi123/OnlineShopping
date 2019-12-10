-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 10, 2019 at 04:21 PM
-- Server version: 10.4.8-MariaDB
-- PHP Version: 7.1.32

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `terminsurancecalculator`
--

-- --------------------------------------------------------

--
-- Table structure for table `rider`
--

CREATE TABLE `rider` (
  `id` int(11) NOT NULL,
  `name` varchar(32) NOT NULL,
  `percentOfPremium` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `rider`
--

INSERT INTO `rider` (`id`, `name`, `percentOfPremium`) VALUES
(1, 'vamsi', 90),
(2, 'sai', 13.4),
(3, 'sai', 32),
(4, 'sai', 32),
(5, 'sai', 32),
(6, 'sai', 32),
(7, 'sai', 32),
(8, 'sai', 32),
(9, 'sai', 32),
(10, 'sai', 32),
(11, 'sai', 32),
(12, 'sai', 32),
(13, 'sai', 13.4),
(14, 'sai', 13.4),
(15, 'sai', 32),
(16, 'sai', 32),
(17, 'sai', 32),
(18, 'sai', 32),
(19, 'sai', 32),
(20, 'sai', 32),
(21, 'sai', 32),
(22, 'sai', 32),
(23, 'sai', 32),
(24, 'sai', 32),
(25, 'sai', 13.4),
(26, 'sai', 13.4),
(27, 'sai', 32),
(28, 'sai', 32),
(29, 'sai', 32),
(30, 'sai', 32),
(31, 'sai', 32),
(32, 'sai', 32),
(33, 'sai', 32),
(34, 'sai', 32),
(35, 'sai', 32),
(36, 'sai', 32),
(37, 'sai', 13.4),
(38, 'sai', 32),
(39, 'sai', 32),
(40, 'sai', 32),
(41, 'sai', 32),
(42, 'sai', 32),
(43, 'sai', 32),
(44, 'sai', 32),
(45, 'sai', 32),
(46, 'sai', 32),
(47, 'sai', 32),
(48, 'sai', 13.4),
(49, 'sai', 13.4),
(50, 'sai', 32),
(51, 'sai', 32),
(52, 'sai', 32),
(53, 'sai', 32),
(54, 'sai', 32),
(55, 'sai', 32),
(56, 'sai', 32),
(57, 'sai', 32),
(58, 'sai', 32),
(59, 'sai', 32),
(60, 'sai', 13.4),
(61, 'sai', 13.4),
(62, 'sai', 13.4),
(63, 'sai', 32),
(64, 'sai', 32),
(65, 'sai', 32),
(66, 'sai', 32),
(67, 'sai', 32),
(68, 'sai', 32),
(69, 'sai', 32),
(70, 'sai', 32),
(71, 'sai', 32),
(72, 'sai', 32),
(73, 'sai', 13.4),
(74, 'sai', 32),
(75, 'sai', 32),
(76, 'sai', 32),
(77, 'sai', 32),
(78, 'sai', 32),
(79, 'sai', 32),
(80, 'sai', 32),
(81, 'sai', 32),
(82, 'sai', 32),
(83, 'sai', 32),
(84, 'sai', 13.4),
(85, 'sai', 13.4),
(86, 'sai', 13.4),
(87, 'sai', 32),
(88, 'sai', 32),
(89, 'sai', 32),
(90, 'sai', 32),
(91, 'sai', 32),
(92, 'sai', 32),
(93, 'sai', 32),
(94, 'sai', 32),
(95, 'sai', 32),
(96, 'sai', 32),
(97, 'sai', 13.4),
(98, 'sai', 32),
(99, 'sai', 32),
(100, 'sai', 32),
(101, 'sai', 32),
(102, 'sai', 32),
(103, 'sai', 32),
(104, 'sai', 32),
(105, 'sai', 32),
(106, 'sai', 32),
(107, 'sai', 32),
(108, 'sai', 13.4),
(109, 'sai', 13.4),
(110, 'sai', 13.4),
(111, 'sai', 13.4),
(112, 'sai', 32),
(113, 'sai', 32),
(114, 'sai', 32),
(115, 'sai', 32),
(116, 'sai', 32),
(117, 'sai', 32),
(118, 'sai', 32),
(119, 'sai', 32),
(120, 'sai', 32),
(121, 'sai', 32),
(122, 'sai', 13.4),
(123, 'sai', 13.4),
(124, 'sai', 32),
(125, 'sai', 32),
(126, 'sai', 32),
(127, 'sai', 32),
(128, 'sai', 32),
(129, 'sai', 32),
(130, 'sai', 32),
(131, 'sai', 32),
(132, 'sai', 32),
(133, 'sai', 32),
(134, 'sai', 13.4),
(135, 'sai', 13.4),
(136, 'sai', 32),
(137, 'sai', 32),
(138, 'sai', 32),
(139, 'sai', 32),
(140, 'sai', 32),
(141, 'sai', 32),
(142, 'sai', 32),
(143, 'sai', 32),
(144, 'sai', 32),
(145, 'sai', 32),
(146, 'sai', 13.4),
(147, 'sai', 13.4),
(148, 'sai', 32),
(149, 'sai', 32),
(150, 'sai', 32),
(151, 'sai', 32),
(152, 'sai', 32),
(153, 'sai', 32),
(154, 'sai', 32),
(155, 'sai', 32),
(156, 'sai', 32),
(157, 'sai', 32),
(158, 'sai', 13.4),
(159, 'sai', 32),
(160, 'sai', 32),
(161, 'sai', 32),
(162, 'sai', 32),
(163, 'sai', 32),
(164, 'sai', 32),
(165, 'sai', 32),
(166, 'sai', 32),
(167, 'sai', 32),
(168, 'sai', 32),
(169, 'sai', 13.4),
(170, 'sai', 13.4),
(171, 'sai', 13.4),
(172, 'sai', 32),
(173, 'sai', 32),
(174, 'sai', 32),
(175, 'sai', 32),
(176, 'sai', 32),
(177, 'sai', 32),
(178, 'sai', 32),
(179, 'sai', 32),
(180, 'sai', 32),
(181, 'sai', 32),
(182, 'sai', 13.4),
(183, 'sai', 32),
(184, 'sai', 32),
(185, 'sai', 32),
(186, 'sai', 32),
(187, 'sai', 32),
(188, 'sai', 32),
(189, 'sai', 32),
(190, 'sai', 32),
(191, 'sai', 32),
(192, 'sai', 32),
(193, 'sai', 13.4),
(194, 'sai', 13.4),
(195, 'sai', 13.4),
(196, 'sai', 32),
(197, 'sai', 32),
(198, 'sai', 32),
(199, 'sai', 32),
(200, 'sai', 32),
(201, 'sai', 32),
(202, 'sai', 32),
(203, 'sai', 32),
(204, 'sai', 32),
(205, 'sai', 32),
(206, 'sai', 32),
(207, 'sai', 32),
(208, 'sai', 32),
(209, 'sai', 32),
(210, 'sai', 32),
(211, 'sai', 32),
(212, 'sai', 32),
(213, 'sai', 32),
(214, 'sai', 32),
(215, 'sai', 32),
(216, 'sai', 13.4),
(217, 'sai', 13.4),
(218, 'sai', 32),
(219, 'sai', 32),
(220, 'sai', 32),
(221, 'sai', 32),
(222, 'sai', 32),
(223, 'sai', 32),
(224, 'sai', 32),
(225, 'sai', 32),
(226, 'sai', 32),
(227, 'sai', 32),
(228, 'sai', 13.4),
(229, 'sai', 13.4),
(230, 'sai', 32),
(231, 'sai', 32),
(232, 'sai', 32),
(233, 'sai', 32),
(234, 'sai', 32),
(235, 'sai', 32),
(236, 'sai', 32),
(237, 'sai', 32),
(238, 'sai', 32),
(239, 'sai', 32),
(240, 'sai', 13.4),
(241, 'sai', 13.4),
(242, 'sai', 13.4),
(243, 'sai', 32),
(244, 'sai', 32),
(245, 'sai', 32),
(246, 'sai', 32),
(247, 'sai', 32),
(248, 'sai', 32),
(249, 'sai', 32),
(250, 'sai', 32),
(251, 'sai', 32),
(252, 'sai', 32),
(253, 'sai', 13.4),
(254, 'sai', 13.4),
(255, 'sai', 32),
(256, 'sai', 32),
(257, 'sai', 32),
(258, 'sai', 32),
(259, 'sai', 32),
(260, 'sai', 32),
(261, 'sai', 32),
(262, 'sai', 32),
(263, 'sai', 32),
(264, 'sai', 32),
(265, 'sai', 13.4);

-- --------------------------------------------------------

--
-- Table structure for table `terminsurance`
--

CREATE TABLE `terminsurance` (
  `id` int(11) NOT NULL,
  `name` varchar(32) NOT NULL,
  `perCentOfSumAssured` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `terminsurance`
--

INSERT INTO `terminsurance` (`id`, `name`, `perCentOfSumAssured`) VALUES
(1, 'Janu', 75),
(2, 'sai', 30),
(3, 'sai', 30),
(4, 'vamsi', 80),
(5, 'vamsi', 80),
(6, 'vamsi', 80),
(7, 'vamsi', 80),
(8, 'vamsi', 80),
(9, 'vamsi', 80),
(10, 'sai', 30),
(11, 'vamsi', 80),
(12, 'vamsi', 80),
(13, 'vamsi', 80),
(14, 'sai', 30),
(15, 'vamsi', 80),
(16, 'vamsi', 80),
(17, 'vamsi', 80),
(18, 'sai', 30),
(19, 'sai', 30),
(20, 'vamsi', 80),
(21, 'vamsi', 80),
(22, 'vamsi', 80),
(23, 'sai', 30),
(24, 'sai', 30),
(25, 'sai', 30),
(26, 'vamsi', 80),
(27, 'vamsi', 80),
(28, 'vamsi', 80),
(29, 'sai', 30),
(30, 'sai', 30),
(31, 'vamsi', 80),
(32, 'vamsi', 80),
(33, 'vamsi', 80),
(34, 'sai', 30),
(35, 'sai', 30),
(36, 'vamsi', 80),
(37, 'vamsi', 80),
(38, 'vamsi', 80),
(39, 'sai', 30),
(40, 'sai', 30),
(41, 'vamsi', 80),
(42, 'vamsi', 80),
(43, 'vamsi', 80),
(44, 'sai', 30),
(45, 'sai', 30),
(46, 'sai', 30),
(47, 'vamsi', 80),
(48, 'vamsi', 80),
(49, 'vamsi', 80),
(50, 'sai', 30),
(51, 'vamsi', 80),
(52, 'vamsi', 80),
(53, 'vamsi', 80),
(54, 'sai', 30),
(55, 'sai', 30),
(56, 'vamsi', 80),
(57, 'vamsi', 80),
(58, 'vamsi', 80),
(59, 'sai', 30),
(60, 'sai', 30),
(61, 'vamsi', 80),
(62, 'vamsi', 80),
(63, 'vamsi', 80),
(64, 'sai', 30),
(65, 'sai', 30),
(66, 'vamsi', 80),
(67, 'vamsi', 80),
(68, 'vamsi', 80),
(69, 'sai', 30),
(70, 'sai', 30),
(71, 'vamsi', 80),
(72, 'vamsi', 80),
(73, 'vamsi', 80),
(74, 'sai', 30),
(75, 'sai', 30),
(76, 'vamsi', 80),
(77, 'vamsi', 80),
(78, 'vamsi', 80),
(79, 'sai', 30),
(80, 'sai', 30),
(81, 'vamsi', 80),
(82, 'vamsi', 80),
(83, 'vamsi', 80),
(84, 'sai', 30),
(85, 'sai', 30),
(86, 'vamsi', 80),
(87, 'vamsi', 80),
(88, 'vamsi', 80),
(89, 'sai', 30),
(90, 'sai', 30),
(91, 'vamsi', 80),
(92, 'vamsi', 80),
(93, 'vamsi', 80),
(94, 'sai', 30),
(95, 'sai', 30),
(96, 'vamsi', 80),
(97, 'vamsi', 80),
(98, 'vamsi', 80),
(99, 'sai', 30),
(100, 'sai', 30),
(101, 'vamsi', 80),
(102, 'vamsi', 80),
(103, 'vamsi', 80),
(104, 'sai', 30),
(105, 'vamsi', 80),
(106, 'vamsi', 80),
(107, 'vamsi', 80),
(108, 'sai', 30),
(109, 'sai', 30),
(110, 'sai', 30),
(111, 'vamsi', 80),
(112, 'vamsi', 80),
(113, 'vamsi', 80),
(114, 'sai', 30),
(115, 'sai', 30),
(116, 'sai', 30),
(117, 'vamsi', 80),
(118, 'vamsi', 80),
(119, 'vamsi', 80),
(120, 'sai', 30),
(121, 'vamsi', 80),
(122, 'vamsi', 80),
(123, 'vamsi', 80),
(124, 'sai', 30);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `rider`
--
ALTER TABLE `rider`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `terminsurance`
--
ALTER TABLE `terminsurance`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `rider`
--
ALTER TABLE `rider`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=266;

--
-- AUTO_INCREMENT for table `terminsurance`
--
ALTER TABLE `terminsurance`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=125;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;