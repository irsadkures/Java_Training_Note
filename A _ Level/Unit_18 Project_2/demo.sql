-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 03 Oca 2024, 12:07:07
-- Sunucu sürümü: 10.4.32-MariaDB
-- PHP Sürümü: 8.1.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `demo`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `adminler`
--

CREATE TABLE `adminler` (
  `username` text NOT NULL,
  `password` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_turkish_ci;

--
-- Tablo döküm verisi `adminler`
--

INSERT INTO `adminler` (`username`, `password`) VALUES
('irsad kures', '12345');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `calisanlar`
--

CREATE TABLE `calisanlar` (
  `id` int(11) NOT NULL,
  `ad` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `soyad` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `departman` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `maas` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_turkish_ci;

--
-- Tablo döküm verisi `calisanlar`
--

INSERT INTO `calisanlar` (`id`, `ad`, `soyad`, `departman`, `maas`) VALUES
(1, 'Recep', 'UYANIK', 'İnsan Kaynakları', '6000'),
(2, 'Zeliha', 'YÜCEL', 'Bilişim', '4500'),
(3, 'Merve', 'SÖNMEZ', 'İnsan Kaynakları', '3000'),
(4, 'Merve', 'VURAL', 'İnsan Kaynakları', '2000'),
(5, 'Havva', 'KANDEMİR', 'Bilişim', '6000'),
(6, 'Hatice', 'YÜZBAŞIOĞLU', 'Yönetim', '4500'),
(7, 'Ahmet', 'YÜZBAŞIOĞLU', 'Yönetim', '4500'),
(8, 'Mustafa', 'TÜTEN', 'İnsan Kaynakları', '4000'),
(9, 'Mustafa', 'ERDEM', 'Yönetim', '4500'),
(10, 'Havva', 'VURAL', 'Bilişim', '5500'),
(11, 'Esra', 'AKBULUT', 'Pazarlama', '6000'),
(12, 'Hanife', 'YAVUZ', 'Yönetim', '6000'),
(13, 'Meryem', 'UYANIK', 'Yönetim', '4000'),
(14, 'Emine', 'ŞEN', 'Yönetim', '2000'),
(15, 'Hüseyin', 'ŞEN', 'İnsan Kaynakları', '2000'),
(16, 'Hüseyin', 'YÜCEL', 'İnsan Kaynakları', '2000'),
(17, 'Özlem', 'ÇEVİK', 'Yönetim', '4000'),
(18, 'Yunus Emre', 'ERDEM', 'Pazarlama', '4500'),
(19, 'Zeynep', 'ÖZTÜRK', 'Yönetim', '5000'),
(20, 'Hülya', 'ÖZTÜRK', 'İnsan Kaynakları', '3000'),
(21, 'İsmail', 'ERDEM', 'Pazarlama', '2500'),
(22, 'Esra', 'KANDEMİR', 'Yönetim', '4500'),
(23, 'Umut', 'ERKURAN', 'Bilişim', '4000'),
(24, 'Şerife', 'ERKURAN', 'İnsan Kaynakları', '4000'),
(25, 'Elif', 'VURAL', 'Pazarlama', '5000'),
(26, 'Mustafa', 'ŞEN', 'İnsan Kaynakları', '5500'),
(27, 'Meryem', 'KANDEMİR', 'Bilişim', '4000'),
(28, 'Enes', 'ÇEVİK', 'Bilişim', '3000'),
(29, 'Abdullah', 'ERTEKİN', 'İnsan Kaynakları', '2000'),
(30, 'Mehmet', 'ORHON', 'Pazarlama', '5000'),
(31, 'Ömer', 'SÖNMEZ', 'Pazarlama', '2000'),
(32, 'Abdullah', 'AKBULUT', 'İnsan Kaynakları', '6000'),
(33, 'Meryem', 'SÖNMEZ', 'Pazarlama', '3000'),
(34, 'İsmail', 'SÖNMEZ', 'Bilişim', '2500'),
(35, 'Zeynep', 'ŞEN', 'Yönetim', '6000'),
(36, 'Ayşe', 'YÜZBAŞIOĞLU', 'Pazarlama', '3000'),
(37, 'Enes', 'ŞEN', 'İnsan Kaynakları', '5500'),
(38, 'Şerife', 'ÇEVİK', 'İnsan Kaynakları', '2500'),
(39, 'Furkan', 'ERKURAN', 'Pazarlama', '4000'),
(40, 'Muhammed', 'ÖZTÜRK', 'Yönetim', '5000'),
(41, 'Hatice', 'VURAL', 'Yönetim', '2000'),
(42, 'Emine', 'ERTEKİN', 'Bilişim', '5000'),
(43, 'Hülya', 'YAVUZ', 'İnsan Kaynakları', '6000'),
(44, 'Meryem', 'ERTEKİN', 'Yönetim', '6000'),
(45, 'Hasan', 'YÜZBAŞIOĞLU', 'Bilişim', '3000'),
(46, 'Fadime', 'DEDE', 'İnsan Kaynakları', '2000'),
(47, 'Hasan', 'AKBULUT', 'Yönetim', '2500'),
(48, 'Süleyman', 'DEDE', 'İnsan Kaynakları', '4500'),
(49, 'Emine', 'ASLAN', 'Yönetim', '6000'),
(50, 'Hacer', 'ERKURAN', 'Bilişim', '2500');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `calisanlar`
--
ALTER TABLE `calisanlar`
  ADD PRIMARY KEY (`id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `calisanlar`
--
ALTER TABLE `calisanlar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=51;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
