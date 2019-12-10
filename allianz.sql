-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 10, 2019 at 04:20 PM
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
-- Database: `allianz`
--

-- --------------------------------------------------------

--
-- Table structure for table `addtocart`
--

CREATE TABLE `addtocart` (
  `id` int(11) NOT NULL,
  `orderId` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `quantity` int(16) NOT NULL,
  `total` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `addtocart`
--

INSERT INTO `addtocart` (`id`, `orderId`, `product_id`, `quantity`, `total`) VALUES
(8, 7, 102, 1, 100),
(9, 7, 103, 1, 200),
(10, 8, 102, 1, 100),
(11, 8, 103, 1, 200),
(12, 9, 102, 1, 100),
(13, 9, 103, 1, 200);

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `category_id` int(11) NOT NULL,
  `category_code` varchar(32) NOT NULL,
  `category_description` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`category_id`, `category_code`, `category_description`) VALUES
(1, 'C100', 'C100DESC'),
(2, 'C101', 'C101DESC'),
(3, 'C102', 'C102DESC'),
(4, 'C103', 'C103DESC'),
(5, 'C104', 'C104DESC');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `customerId` int(11) NOT NULL,
  `username` varchar(16) NOT NULL,
  `password` varchar(16) NOT NULL,
  `email` varchar(32) NOT NULL,
  `phoneNo` varchar(32) NOT NULL,
  `landmark` varchar(32) NOT NULL,
  `address` varchar(32) NOT NULL,
  `pinNo` varchar(16) NOT NULL,
  `city` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`customerId`, `username`, `password`, `email`, `phoneNo`, `landmark`, `address`, `pinNo`, `city`) VALUES
(1001, 'customer1', 'customer1', 'customer1@gmail.com', '9999999999', 'customer1Landmark', 'customer1Address', '9999999999', 'customer1City'),
(1002, 'customer2', 'customer2', 'customer2@gmail.com', '8888888888', 'customer2Landmark', 'customer2Address', '888888', 'customer2City'),
(1003, 'customer3', 'customer3', 'customer3@gmail.com', '7777777777', 'customer3Landmark', 'customer3Address', '777777', 'customer3City');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(32) NOT NULL,
  `password` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('one', 'one'),
('two', 'two');

-- --------------------------------------------------------

--
-- Table structure for table `order_`
--

CREATE TABLE `order_` (
  `orderId` int(11) NOT NULL,
  `orderDate` date NOT NULL,
  `orderStatus` varchar(16) NOT NULL,
  `username` varchar(16) NOT NULL,
  `totalPrice` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `order_`
--

INSERT INTO `order_` (`orderId`, `orderDate`, `orderStatus`, `username`, `totalPrice`) VALUES
(5, '2019-11-22', 'ordered', 'customer1', 600),
(6, '2019-11-22', 'ordered', 'customer1', 300),
(7, '2019-11-22', 'ordered', 'customer1', 300),
(8, '2019-11-22', 'ordered', 'customer1', 300),
(9, '2019-11-22', 'ordered', 'customer1', 300);

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `id` int(11) NOT NULL,
  `code` varchar(16) NOT NULL,
  `description` varchar(16) NOT NULL,
  `price` float NOT NULL,
  `mfgDate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`id`, `code`, `description`, `price`, `mfgDate`) VALUES
(102, 'pc01', 'prodesc1', 100, '2012-12-12'),
(103, 'pc02', 'prodesc2', 200, '2012-12-14'),
(104, 'pc03', 'prodesc3', 300, '2012-11-14'),
(105, 'pc04', 'prodesc4', 400, '2012-10-15'),
(106, 'pc05', 'prodesc5', 500, '2012-02-05');

-- --------------------------------------------------------

--
-- Table structure for table `product_category`
--

CREATE TABLE `product_category` (
  `category_id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `product_category`
--

INSERT INTO `product_category` (`category_id`, `product_id`) VALUES
(1, 102),
(2, 103),
(3, 104),
(4, 105),
(5, 106),
(1, 104),
(2, 102);

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `ROLL_NO` int(10) NOT NULL,
  `NAME` varchar(100) NOT NULL,
  `MARK` int(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`ROLL_NO`, `NAME`, `MARK`) VALUES
(1, 'saivamsi', 98);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `username` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL,
  `FirstName` varchar(11) NOT NULL,
  `LastName` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `user_login`
--

CREATE TABLE `user_login` (
  `username` varchar(16) NOT NULL,
  `password` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user_login`
--

INSERT INTO `user_login` (`username`, `password`) VALUES
('admin', 'admin'),
('satya', 'satya');

-- --------------------------------------------------------

--
-- Table structure for table `user_registration`
--

CREATE TABLE `user_registration` (
  `id` int(16) NOT NULL,
  `username` varchar(16) NOT NULL,
  `password` varchar(16) NOT NULL,
  `email` varchar(32) NOT NULL,
  `phoneNo` varchar(16) NOT NULL,
  `address` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user_registration`
--

INSERT INTO `user_registration` (`id`, `username`, `password`, `email`, `phoneNo`, `address`) VALUES
(1, 'admin123', 'admin23', 'admin@gmail.com', '9866736456', 'Pune'),
(2, 'satya143', 'satya', 'satya@gmail.com', '8787977789', 'Russia'),
(3, 'sai', 'sai', 'sai@gmail.com', '7688789898', 'America'),
(4, 'vamsi', '123', 'vamsi@gmail.com', '98757658689', 'Pune'),
(5, 'vamsi', '123', 'vamsi@gmail.com', '98757658689', 'Pune'),
(6, 'vamsi', '123', 'vamsi@gmail.com', '98757658689', 'Pune'),
(7, 'vamsi', '123', 'vamsi@gmail.com', '98757658689', 'Pune'),
(8, 'vamsi', 'vamsi', 'vamsi@gmail.com', '3264734', 'Hyderabad'),
(9, 'vamsi', '1234', 'vamsi@gmail.com', '918327', 'Pune'),
(10, 'sai', '1234', 'sai@gmail.com', '2134564354', 'Pune'),
(11, 'satya143', '1234', 'satya@gmail.com', '2138919873', 'pune'),
(12, 'admin123', '1234', 'admin@gmail.com', '219831208', 'pune'),
(13, 'sai', '1234', 'sai@gmail.com', '213453563', 'pune'),
(14, 'vamsi', '1234', 'vamsi@gmail.com', '23145', 'pune'),
(15, 'sai', '1234', 'sai@gmail.com', '21342', 'unjen'),
(16, 'vamsi', '1234', 'vamsi@gmail.com', '1324444389', 'pune'),
(17, 'vamsi', '213', 'vamsi@gmail.com', '1234', 'ewqrkjn'),
(18, 'sai', '123', 'sai@gmail.com', '231', 'ehb2'),
(19, 'satya123', '213', 'saty@gmail.com', '12345', 'ewhfi'),
(20, 'satya143', '82163871', 'satya@gmail.com', '87213687126', 'qwhdiuwq'),
(21, 'sai', '1234', 'sai@gmail.com', '1234567', 'pune'),
(22, 'sai', '1234', 'sai@gmail.com', '1234567', 'pune');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `addtocart`
--
ALTER TABLE `addtocart`
  ADD PRIMARY KEY (`id`),
  ADD KEY `orderId` (`orderId`),
  ADD KEY `product_id` (`product_id`);

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`category_id`),
  ADD UNIQUE KEY `category_id` (`category_id`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`customerId`);

--
-- Indexes for table `order_`
--
ALTER TABLE `order_`
  ADD PRIMARY KEY (`orderId`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `id` (`id`),
  ADD UNIQUE KEY `code` (`code`);

--
-- Indexes for table `product_category`
--
ALTER TABLE `product_category`
  ADD KEY `category` (`category_id`),
  ADD KEY `product` (`product_id`);

--
-- Indexes for table `user_registration`
--
ALTER TABLE `user_registration`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `addtocart`
--
ALTER TABLE `addtocart`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `category`
--
ALTER TABLE `category`
  MODIFY `category_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `customerId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1004;

--
-- AUTO_INCREMENT for table `order_`
--
ALTER TABLE `order_`
  MODIFY `orderId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=107;

--
-- AUTO_INCREMENT for table `user_registration`
--
ALTER TABLE `user_registration`
  MODIFY `id` int(16) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `addtocart`
--
ALTER TABLE `addtocart`
  ADD CONSTRAINT `orderId` FOREIGN KEY (`orderId`) REFERENCES `order_` (`orderId`),
  ADD CONSTRAINT `product_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`);

--
-- Constraints for table `product_category`
--
ALTER TABLE `product_category`
  ADD CONSTRAINT `category` FOREIGN KEY (`category_id`) REFERENCES `category` (`category_id`),
  ADD CONSTRAINT `product` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
