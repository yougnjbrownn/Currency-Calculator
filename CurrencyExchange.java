import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


abstract class Countries {

	abstract double rate();

}

class AlbanianLek extends Countries {
	 double rate() {
		return 121.48;
	}

	public String toString() {
		return "Albanian Lek";
	}
}

class AlgerianDinar extends Countries {
	double rate() {
      return 109.11;
	}
	public String toString() {
		return "Algerian Dinar";
	}
}

class AngolanKwanza extends Countries {
	double rate() {
		return 165.73;
	}

	public String toString() {
		return "Angolan Kwanza";
	}
}

class ArgentinePeso extends Countries {
	double rate() {
		return 14.43;
	}
	public String toString() {
		return "Argentine Peso";
	}
}

class ArmenianDram extends Countries {
	double rate() {
		return 480.58;
	}
	public String toString() {
		return "Armenian Dram";
	}
}

class ArubanFlorin extends Countries {
	double rate() {
		return 1.79;

	}
	public String toString() {
		return "Aruban Florin";
	}
}

class AustralianDollar extends Countries {
	double rate() {
	 return 1.29;
	}
	public String toString() {
		return "Australian Dollar";
	}
}

class AzerbaijaniManat extends Countries {
	double rate() {
		return 1.51;
	}
	public String toString() {
		return "Azerbaijani Manat";
	}
}

class BahamianDollar extends Countries {
	double rate() {
		return 1.00;
	}
	public String toString() {
		return "Bahamian Dollar";
	}
}

class BahrainiDinar extends Countries {
	double rate() {
		return 0.38;
	}
	public String toString() {
		return "Bahraini Dinar";
	}
}

class BangladeshiTaka extends Countries {
	double rate() {
		return 78.39;
	}
	public String toString() {
		return "Bangladeshi Taka";
	}
}

class BarbadianDollar extends Countries {
	double rate() {
		return 2.00;
	}
	public String toString() {
		return "Barbadian Dollar";
	}
}

class BelarusianRuble extends Countries {
	double rate() {
		return 19600.00;
	}
	public String toString() {
		return "Belarusian Ruble";
	}
}

class BelizeDollar extends Countries {
	double rate() {
		return 2.00;
	}
	public String toString() {
		return "Belize Dollar";
	}
}

class BermudanDollar extends Countries {
	double rate() {
		return 1.00;
	}
	public String toString() {
		return "Bermudan Dollar";
	}
}

class BhutaneseNgultrum extends Countries {
	double rate() {
		return 66.36;
	}
	public String toString() {
		return "Bhutanese Ngultrum";
	}
}

class Bitcoin extends Countries {
	double rate() {
		return 0.0022;
	}
	public String toString() {
		return "Bitcoin";
	}
}

class BolivianBoliviano extends Countries {
	double rate() {
		return 6.91;
	}
	public String toString() {
		return "Bolivian Boliviano";
	}
}

class BosniaHerzegovinaConvertibleMark extends Countries {
	double rate() {
		return 1.73;
	}
	public String toString() {
		return "Bosnia-Herzegovina Convertible Mark";
	}
}

class BotswananPula extends Countries {
	double rate() {
		return 10.67;
	}
	public String toString() {
		return "Botswanan Pula";
	}
}

class BrazilianReal extends Countries {
	double rate() {
		return 3.54;
	}
	public String toString() {
		return "Brazilian Real";
	}
}

class BritishPound extends Countries {
	double rate() {
		return 0.70;
	}
	public String toString() {
		return "British Pound";
	}
}

class BruneiDollar extends Countries {
	double rate() {
		return 1.35;
	}
	public String toString() {
		return "Brunei Dollar";
	}
}

class BulgarianLev extends Countries {
	double rate() {
		return 1.73;
	}
	public String toString() {
		return "Bulgarian Lev";
	}
}

class BurundianFranc extends Countries {
	double rate() {
		return 1559.30;
	}
	public String toString() {
		return "Burundian Franc";
	}
}

class CambodianRiel extends Countries {
	double rate() {
		return 4044.45 ;

	}
	public String toString() {
		return "Cambodian Riel";
	}
}

class CanadianDollar extends Countries {
	double rate() {
		return 1.27;
	}
	public String toString() {
		return "Canadian Dollar";
	}
}

class CapeVerdeanEscudo extends Countries {
	double rate() {
		return 97.22 ;
	}
	public String toString() {
		return "Cape Verdean Escudo";
	}
}
class CaymanIslandsDollar extends Countries {
	double rate() {
		return 0.82;
	}
	public String toString() {
		return "Cayman Islands Dollar";
	}
}
class CentralAfricanCFAFranc extends Countries {
	double rate() {
		return 580.42;
	}
	public String toString() {
		return "Central African CFA Franc";
	}
}
class CFPFranc extends Countries {
	double rate() {
		return 105.59 ;
	}
	public String toString() {
		return "CFP Franc";
	}
}
class ChileanPeso extends Countries {
	double rate() {
		return 658.39 ;
	}
	public String toString() {
		return "Chilean Peso";
	}
}
class ChineseYuan extends Countries {
	double rate() {
		return 6.48;
	}
	public String toString() {
		return "Chinese Yuan";
	}
}
class ColombianPeso extends Countries {
	double rate() {
		return 2936.69;
	}
	public String toString() {
		return "Colombian Peso";
	}
}
class ComorianFranc extends Countries {
	double rate() {
		return 435.31;
	}
	public String toString() {
		return "Comorian Franc";
	}
}
class CostaRicanColón extends Countries {
	double rate() {
		return 534.32;
	}
	public String toString() {
		return "Costa Rican Colón";
	}
}
class CongoleseFranc extends Countries {
	double rate() {
		return 923.00;
	}
	public String toString() {
		return "Congolese Franc";
	}
}
class CroatianKuna extends Countries {
	double rate() {
		return 6.62;
	}
	public String toString() {
		return "Croatian Kuna";
	}
}
class CzechRepublicKoruna extends Countries {
	double rate() {
		return 23.90;
	}
	public String toString() {
		return "Czech Republic Koruna";
	}
}
class DanishKrone extends Countries {
	double rate() {
		return 6.58;
	}
	public String toString() {
		return "Danish Krone";
	}
}
class DjiboutianFranc extends Countries {
	double rate() {
		return 177.77 ;
	}
	public String toString() {
		return "Djiboutian Franc";
	}
}
class DominicanPeso extends Countries {
	double rate() {
		return 45.83;
	}
	public String toString() {
		return "Dominican Peso";
	}
}
class EastCaribbeanDollar extends Countries {
	double rate() {
		return 2.70;
	}
	public String toString() {
		return "East Caribbean Dollar";
	}
}
class EgyptianPound extends Countries {
	double rate() {
		return 8.88;
	}
	public String toString() {
		return "Egyptian Pound";
	}
}
class EritreanNakfa extends Countries {
	double rate() {
		return 16.18;
	}
	public String toString() {
		return "Eritrean Nakfa";
	}
}
class EstonianKroon extends Countries {
	double rate() {
		return 11.73;
	}
	public String toString() {
		return "Estonian Kroon";
	}
}
class EthiopianBirr extends Countries {
	double rate() {
		return 21.55;
	}
	public String toString() {
		return "Ethiopian Birr";
	}
}
class Euro extends Countries {
	double rate() {
		return 0.88;
	}
	public String toString() {
		return "Euro";
	}
}
class FalklandIslandsPound extends Countries {
	double rate() {
		return 0.66;
	}
	public String toString() {
		return "Falkland Islands Pound";
	}
}
class FijianDollar extends Countries {
	double rate() {
		return 2.06;
	}
	public String toString() {
		return "Fijian Dollar";
	}
}
class GambianDalasi extends Countries {
	double rate() {
		return 42.60 ;
	}
	public String toString() {
		return "Gambian Dalasi";
	}
}
class GeorgianLari extends Countries {
	double rate() {
		return 2.24;
	}
	public String toString() {
		return "Georgian Lari";
	}
}
class GermanMark extends Countries {
	double rate() {
		return 1.72;
	}
	public String toString() {
		return "German Mark";
	}
}
class GhanaianCedi extends Countries {
	double rate() {
		return 3.82;
	}
	public String toString() {
		return "Ghanaian Cedi";
	}
}
class GibraltarPound extends Countries {
	double rate() {
		return 0.69 ;
	}
	public String toString() {
		return "Gibraltar Pound";
	}
}
class GuatemalanQuetzal extends Countries {
	double rate() {
		return 7.74 ;
	}
	public String toString() {
		return "Guatemalan Quetzal";
	}
}
class GuineanFranc extends Countries {
	double rate() {
		return 7594.95 ;
	}
	public String toString() {
		return "Guinean Franc";
	}
}

class GuyanaeseDollar extends Countries {
	double rate() {
		return 207.21;
	}
	public String toString() {
		return "Guyanaese Dollar";
	}
}

class HaitianGourde extends Countries {
	double rate() {
		return 61.92;
	}
	public String toString() {
		return "Haitian Gourde";
	}
}
class HonduranLempira extends Countries {
	double rate() {
		return 22.56;
	}
	public String toString() {
		return "Honduran Lempira";
	}
}
class HongKongDollar extends Countries {
	double rate() {
		return 7.76;
	}
	public String toString() {
		return "Hong Kong Dollar";
	}
}
class HungarianForint extends Countries {
	double rate() {
		return 274.29;
	}
	public String toString() {
		return "Hungarian Forint";
	}
}
class IcelandicKróna extends Countries {
	double rate() {
		return 124.42;
	}
	public String toString() {
		return "Icelandic Króna";
	}
}
class IndianRupee extends Countries {
	double rate() {
		return 66.47;
	}
	public String toString() {
		return "Indian Rupee";
	}
}
class IndonesianRupiah extends Countries {
	double rate() {
		return 13167.50 ;
	}
	public String toString() {
		return "Indonesian Rupiah";
	}
}
class IranianRial extends Countries {
	double rate() {
		return 30296.00;
	}
	public String toString() {
		return "Iranian Rial";
	}
}
class IraqiDinar extends Countries {
	double rate() {
		return 1107.10;
	}
	public String toString() {
		return "Iraqi Dinar";
	}
}
class IsraeliNewSheqel extends Countries {
	double rate() {
		return 3.77;
	}
	public String toString() {
		return "Israeli New Sheqel";
	}
}
class ItalianLira extends Countries {
	double rate() {
		return 1709.66;
	}
	public String toString() {
		return "Italian Lira";
	}
}
class JamaicanDollar extends Countries {
	double rate() {
		return 122.16;
	}
	public String toString() {
		return "Jamaican Dollar";
	}
}

class JapaneseYen extends Countries {
	double rate() {
		return 109.55;
	}
	public String toString() {
		return "Japanese Yen";
	}
}
class JordanianDinar extends Countries {
	double rate() {
		return 0.71;
	}
	public String toString() {
		return "Jordanian Dinar";
	}
}

class KazakhstaniTenge extends Countries {
	double rate() {
		return 333.80 ;
	}
	public String toString() {
		return "Kazakhstani Tenge";
	}
}
class KenyanShilling extends Countries {
	double rate() {
		return 101.11;
	}
	public String toString() {
		return "Kenyan Shilling";
	}
}
class KuwaitiDinar extends Countries {
	double rate() {
		return 0.30;
	}
	public String toString() {
		return "Kuwaiti Dinar";
	}
}
class KyrgystaniSom extends Countries {
	double rate() {
		return 68.47;
	}
	public String toString() {
		return "Kyrgystani Som";
	}
}
class LaotianKip extends Countries {
	double rate() {
		return 8018.80;
	}
	public String toString() {
		return "Laotian Kip";
	}
}
class LatvianLats extends Countries {
	double rate() {
		return 0.62;
	}
	public String toString() {
		return "Latvian Lats";
	}
}
class LebanesePound extends Countries {
	double rate() {
		return 1508.10;
	}
	public String toString() {
		return "Lebanese Pound";
	}
}
class LesothoLoti extends Countries {
	double rate() {
		return 14.29;
	}
	public String toString() {
		return "Lesotho Loti";
	}
}
class LiberianDollar extends Countries {
	double rate() {
		return 84.67 ;
	}
	public String toString() {
		return "Liberian Dollar";
	}
}
class LibyanDinar extends Countries {
	double rate() {
		return 1.36 ;
	}
	public String toString() {
		return "Libyan Dinar";
	}
}
class LithuanianLitas extends Countries {
	double rate() {
		return 3.05;
	}
	public String toString() {
		return "Lithuanian Litas";
	}
}
class MacanesePataca extends Countries {
	double rate() {
		return 7.99 ;
	}
	public String toString() {
		return "Macanese Pataca";
	}
}
class MacedonianDenar extends Countries {
	double rate() {
		return 54.50 ;
	}
	public String toString() {
		return "Macedonian Denar";
	}
}
class MalagasyAriary extends Countries {
	double rate() {
		return 3188.95 ;
	}
	public String toString() {
		return "Malagasy Ariary";
	}
}
class MalawianKwacha extends Countries {
	double rate() {
		return 685.88 ;
	}
	public String toString() {
		return "Malawian Kwacha";
	}
}
class MalaysianRinggit extends Countries {
	double rate() {
		return 3.91 ;
	}
	public String toString() {
		return "Malaysian Ringgit";
	}
}
class MaldivianRufiyaa extends Countries {
	double rate() {
		return 15.38;
	}
	public String toString() {
		return "Maldivian Rufiyaa";
	}
}
class MauritanianOuguiya extends Countries {
	double rate() {
		return 347.00 ;
	}
	public String toString() {
		return "Mauritanian Ouguiya";
	}
}
class MauritianRupee extends Countries {
	double rate() {
		return 35.13;
	}
	public String toString() {
		return "Mauritian Rupee";
	}
}
class MexicanPeso extends Countries {
	double rate() {
		return 17.45 ;
	}
	public String toString() {
		return "Mexican Peso";
	}
}
class MoldovanLeu extends Countries {
	double rate() {
		return 19.75;
	}
	public String toString() {
		return "Moldovan Leu";
	}
}
class MongolianTugrik extends Countries {
	double rate() {
		return 1979.00 ;
	}
	public String toString() {
		return "Mongolian Tugrik";
	}
}
class MoroccanDirham extends Countries {
	double rate() {
		return 9.66 ;
	}
	public String toString() {
		return "Moroccan Dirham";
	}
}
class MyanmarKyat extends Countries {
	double rate() {
		return 1185.70;
	}
	public String toString() {
		return "Myanmar Kyat";
	}
}
class NamibianDollar extends Countries {
	double rate() {
		return 14.29 ;
	}
	public String toString() {
		return "Namibian Dollar";
	}
}
class NepaleseRupee extends Countries {
	double rate() {
		return 106.18;
	}
	public String toString() {
		return "Nepalese Rupee";
	}
}
class NetherlandsAntilleanGuilder extends Countries {
	double rate() {
		return 1.79;
	}
	public String toString() {
		return "Netherlands Antillean Guilder";
	}
}
class NewTaiwanDollar extends Countries {
	double rate() {
		return 32.32;
	}
	public String toString() {
		return "New Taiwan Dollar";
	}
}
class NewZealandDollar  extends Countries {
	double rate() {
		return 1.45;
	}
	public String toString() {
		return "New Zealand Dollar";
	}
}
class NicaraguanCórdoba extends Countries {
	double rate() {
		return 28.35;
	}
	public String toString() {
		return "Nicaraguan Córdoba";
	}
}
class NigerianNaira extends Countries {
	double rate() {
		return 199.05 ;
	}
	public String toString() {
		return "Nigerian Naira";
	}
}
class NorthKoreanWon extends Countries {
	double rate() {
		return 900.00 ;
	}
	public String toString() {
		return "North Korean Won";
	}
}
class NorwegianKrone extends Countries {
	double rate() {
		return 8.19 ;
	}
	public String toString() {
		return "Norwegian Krone";
	}
}
class OmaniRial extends Countries {
	double rate() {
		return 0.39;
	}
	public String toString() {
		return "Omani Rial";
	}
}
class PakistaniRupee extends Countries {
	double rate() {
		return 104.72 ;
	}
	public String toString() {
		return "Pakistani Rupee";
	}
}
class PanamanianBalboa extends Countries {
	double rate() {
		return 1.00;
	}
	public String toString() {
		return "Panamanian Balboa";
	}
}
class PapuaNewGuineanKina extends Countries {
	double rate() {
		return 3.14;
	}
	public String toString() {
		return "Papua New Guinean Kina";
	}
}
class ParaguayanGuarani extends Countries {
	double rate() {
		return 5535.24 ;
	}
	public String toString() {
		return "Paraguayan Guarani";
	}
}
class PeruvianNuevoSol extends Countries {
	double rate() {
		return 3.27;
	}
	public String toString() {
		return "Peruvian Nuevo Sol";
	}
}
class PhilippinePeso extends Countries {
	double rate() {
		return 46.53;
	}
	public String toString() {
		return "Philippine Peso";
	}
}
class PolishZloty extends Countries {
	double rate() {
		return 3.82;
	}
	public String toString() {
		return "Polish Zloty";
	}
}
class QatariRial extends Countries {
	double rate() {
		return 3.64 ;
	}
	public String toString() {
		return "Qatari Rial";
	}
}
class RomanianLeu extends Countries {
	double rate() {
		return 3.97 ;
	}
	public String toString() {
		return "Romanian Leu";
	}
}
class RussianRuble extends Countries {
	double rate() {
		return 66.28;
	}
	public String toString() {
		return "Russian Ruble";
	}
}
class RwandanFranc extends Countries {
	double rate() {
		return 775.88;
	}
	public String toString() {
		return "Rwandan Franc";
	}
}
class SalvadoranColón extends Countries {
	double rate() {
		return 8.73;
	}
	public String toString() {
		return "Salvadoran Colón";
	}
}
class SamoanTala extends Countries {
	double rate() {
		return 2.54;
	}
	public String toString() {
		return "Samoan Tala";
	}
}
class SaudiRiyal extends Countries {
	double rate() {
		return 3.75 ;
	}
	public String toString() {
		return "Saudi Riyal";
	}
}
class SerbianDinar extends Countries {
	double rate() {
		return 108.77 ;
	}
	public String toString() {
		return "Serbian Dinar";
	}
}
class SeychelloisRupee extends Countries {
	double rate() {
		return 13.33 ;
	}
	public String toString() {
		return "Seychellois Rupee";
	}
}

class SierraLeoneanLeone extends Countries {
	double rate() {
		return 3953.00 ;
	}
	public String toString() {
		return "Sierra Leonean Leone";
	}
}

class SingaporeDollar extends Countries {
	double rate() {
		return 1.35;
	}
	public String toString() {
		return "Singapore Dollar";
	}
}

class SlovakKoruna extends Countries {
	double rate() {
		return 22.24 ;
	}
	public String toString() {
		return "Slovak Koruna";
	}
}

class SolomonIslandsDollar extends Countries {
	double rate() {
		return 8.01;
	}
	public String toString() {
		return "Solomon Islands Dollar";
	}
}

class SomaliShilling extends Countries {
	double rate() {
		return 602.60;
	}
	public String toString() {
		return "Somali Shilling";
	}
}

class SouthAfricanRand extends Countries {
	double rate() {
		return 14.31;
	}
	public String toString() {
		return "South African Rand";
	}
}

class SouthKoreanWon extends Countries {
	double rate() {
		return 1138.55;
	}
	public String toString() {
		return "South Korean Won";
	}
}

class SpecialDrawingRights extends Countries {
	double rate() {
		return 0.71;
	}
	public String toString() {
		return "Special Drawing Rights";
	}
}

class SriLankanRupee extends Countries {
	double rate() {
		return 146.50;
	}
	public String toString() {
		return "Sri Lankan Rupee";
	}
}

class StHelenaPound extends Countries {
	double rate() {
		return .70;
	}
	public String toString() {
		return "St. Helena Pound";
	}
}

class SudanesePound extends Countries {
	double rate() {
		return 6.10 ;
	}
	public String toString() {
		return "Sudanese Pound";
	}
}

class SurinameseDollar extends Countries {
	double rate() {
		return 5.74 ;
	}
	public String toString() {
		return "Surinamese Dollar";
	}
}

class SwaziLilangeni extends Countries {
	double rate() {
		return 14.29 ;
	}
	public String toString() {
		return "Swazi Lilangeni";
	}
}

class SwedishKrona extends Countries {
	double rate() {
		return 8.13;
	}
	public String toString() {
		return "Swedish Krona";
	}
}

class SwissFranc extends Countries {
	double rate() {
		return 0.97;
	}
	public String toString() {
		return "Swiss Franc";
	}
}

class SyrianPound extends Countries {
	double rate() {
		return 219.86;
	}
	public String toString() {
		return "Syrian Pound";
	}
}

class SãoToméPríncipeDobra extends Countries {
	double rate() {
		return 21662.50 ;
	}
	public String toString() {
		return "São Tomé & Príncipe Dobra";
	}
}

class TajikistaniSomoni extends Countries {
	double rate() {
		return 7.87;
	}
	public String toString() {
		return "Tajikistani Somoni";
	}
}

class TanzanianShilling extends Countries {
	double rate() {
		return 2195.55 ;
	}
	public String toString() {
		return "Tanzanian Shilling";
	}
}

class ThaiBaht extends Countries {
	double rate() {
		return 35.07;
	}
	public String toString() {
		return "Thai Baht";
	}
}

class TonganPaʻanga extends Countries {
	double rate() {
		return 2.18;
	}
	public String toString() {
		return "Tongan Paʻanga";
	}
}

class TrinidadTobagoDollar extends Countries {
	double rate() {
		return 6.62;
	}
	public String toString() {
		return "Trinidad & Tobago Dollar";
	}
}

class TunisianDinar extends Countries {
	double rate() {
		return 2.02 ;
	}
	public String toString() {
		return "Tunisian Dinar";
	}
}

class TurkishLira extends Countries {
	double rate() {
		return 2.83 ;
	}
	public String toString() {
		return "Turkish Lira";
	}
}

class TurkmenistaniManat extends Countries {
	double rate() {
		return 3.50;
	}
	public String toString() {
		return "Turkmenistani Manat";
	}
}

class UgandanShilling extends Countries {
	double rate() {
		return 3305.00;
	}
	public String toString() {
		return "Ugandan Shilling";
	}
}

class UkrainianHryvnia extends Countries {
	double rate() {
		return 25.38 ;
	}
	public String toString() {
		return "Ukrainian Hryvnia";
	}
}
class UnitedArabEmiratesDirham extends Countries {
	double rate() {
		return 3.67;
	}
	public String toString() {
		return "United Arab Emirates Dirham";
	}
}
class UnitedStates extends Countries {
	double rate() {
		return 1.00;
	}
	public String toString() {
		return "United States";
	}
}
class UruguayanPeso extends Countries {
	double rate() {
		return 31.93;
	}
	public String toString() {
		return "Uruguayan Peso";
	}
}
class UzbekistaniSom extends Countries {
	double rate() {
		return 2888.39;
	}
	public String toString() {
		return "Uzbekistani Som";
	}
}
class VanuatuVatu extends Countries {
	double rate() {
		return 107.58 ;
	}
	public String toString() {
		return "Vanuatu Vatu";
	}
}
class VenezuelanBolívar extends Countries {
	double rate() {
		return 9.95;
	}
	public String toString() {
		return "Venezuelan Bolívar";
	}
}
class VietnameseDong extends Countries {
	double rate() {
		return 22289.00 ;
	}
	public String toString() {
		return "Vietnamese Dong";
	}
}
class WestAfricanCFAFranc extends Countries {
	double rate() {
		return 580.47;
	}
	public String toString() {
		return "West African CFA Franc";
	}
}



class gui {
	JLabel label;
	JTextField textField2;
	JTextField textField1;


}


class CurrencyExchange {
	JTextField textField2;
	JTextField textField1;
	JButton click;

	CurrencyExchange() {
		// create the top level window
		JFrame frame = new JFrame("Currency Calculator");
		JPanel north = new JPanel();
		click = new JButton("Convert");
		frame.add(north, BorderLayout.NORTH);

		// register the event handler to the button


		JLabel label = new JLabel("Currency Calculator");
		JPanel south = new JPanel();
		north.add(label);

		frame.add(south, BorderLayout.SOUTH);

		final Countries[] countries = new Countries[158];
		countries[0] = new AlbanianLek();
		countries[1] = new AlgerianDinar ();
		countries[2] = new AngolanKwanza ();
		countries[3] = new ArgentinePeso();
		countries[4] = new ArmenianDram();
		countries[5] = new ArubanFlorin();
		countries[6] = new AustralianDollar();
		countries[7] = new AzerbaijaniManat();
		countries[8] = new  BahamianDollar();
		countries[9] = new  BahrainiDinar ();
		countries[10] = new BangladeshiTaka();
		countries[11] = new BarbadianDollar ();
		countries[12] = new BelarusianRuble();
		countries[13] = new BelizeDollar ();
		countries[14] = new BermudanDollar ();
		countries[15] = new BhutaneseNgultrum();
		countries[16] = new Bitcoin();
		countries[17] = new BolivianBoliviano();
		countries[18] = new BosniaHerzegovinaConvertibleMark ();
		countries[19] = new BotswananPula();
		countries[20] = new BrazilianReal();
		countries[21] = new BritishPound();
		countries[22] = new BruneiDollar();
		countries[23] = new BulgarianLev();
		countries[24] = new BurundianFranc();
		countries[25] = new CambodianRiel();
		countries[26] = new CanadianDollar();
		countries[27] = new CapeVerdeanEscudo();
		countries[28] = new CaymanIslandsDollar();
		countries[29] = new CentralAfricanCFAFranc();
		countries[30] = new CFPFranc();
		countries[31] = new ChileanPeso();
		countries[32] = new ChineseYuan();
		countries[33] = new ColombianPeso();
		countries[34] = new ComorianFranc();
		countries[35] = new CostaRicanColón();
		countries[36] = new CongoleseFranc();
		countries[37] = new CroatianKuna();
		countries[38] = new CzechRepublicKoruna();
		countries[39] = new DanishKrone();
		countries[40] = new DjiboutianFranc();
		countries[41] = new DominicanPeso();
		countries[42] = new EastCaribbeanDollar();
		countries[43] = new EgyptianPound();
		countries[44] = new EritreanNakfa();
		countries[45] = new EstonianKroon();
		countries[46] = new EthiopianBirr();
		countries[47] = new Euro();
		countries[48] = new FalklandIslandsPound();
		countries[49] = new FijianDollar();
		countries[50] = new GambianDalasi();
		countries[51] = new GeorgianLari();
		countries[52] = new GermanMark();
		countries[53] = new GhanaianCedi();
		countries[54] = new GibraltarPound();
		countries[56] = new GuatemalanQuetzal();
		countries[57] = new GuineanFranc();
		countries[58] = new GuyanaeseDollar();
		countries[59] = new HaitianGourde();
		countries[60] = new HonduranLempira();
		countries[61] = new HongKongDollar();
		countries[62] = new HungarianForint();
		countries[63] = new IcelandicKróna();
		countries[64] = new IndianRupee();
		countries[65] = new IndonesianRupiah();
		countries[66] = new IranianRial();
		countries[67] = new IraqiDinar();
		countries[68] = new IsraeliNewSheqel();
		countries[69] = new ItalianLira();
		countries[70] = new JamaicanDollar();
		countries[71] = new JapaneseYen();
		countries[72] = new JordanianDinar();
		countries[73] = new KazakhstaniTenge();
		countries[74] = new KenyanShilling();
		countries[75] = new KuwaitiDinar();
		countries[76] = new KyrgystaniSom();
		countries[77] = new LaotianKip();
		countries[78] = new LatvianLats();
		countries[79] = new LebanesePound();
		countries[80] = new LesothoLoti();
		countries[81] = new LiberianDollar();
		countries[82] = new LibyanDinar();
		countries[83] = new LithuanianLitas();
		countries[84] = new MacanesePataca();
		countries[85] = new MacedonianDenar();
		countries[86] = new MalagasyAriary();
		countries[87] = new MalawianKwacha();
		countries[89] = new MalaysianRinggit();
		countries[90] = new MaldivianRufiyaa();
		countries[91] = new MauritanianOuguiya();
		countries[92] = new MauritianRupee();
		countries[93] = new MexicanPeso();
		countries[93] = new MoldovanLeu();
		countries[94] = new MongolianTugrik();
		countries[95] = new MoroccanDirham();
		countries[96] = new MyanmarKyat();
		countries[97] = new NamibianDollar();
		countries[98] = new NepaleseRupee();
		countries[99] = new NetherlandsAntilleanGuilder();
		countries[100] = new NewTaiwanDollar();
		countries[101] = new NewZealandDollar();
		countries[102] = new NicaraguanCórdoba();
		countries[103] = new NigerianNaira();
		countries[104] = new NorthKoreanWon();
		countries[105] = new NorwegianKrone();
		countries[106] = new OmaniRial();
		countries[107] = new PakistaniRupee();
		countries[108] = new PanamanianBalboa();
		countries[109] = new PapuaNewGuineanKina();
		countries[110] = new ParaguayanGuarani();
		countries[111] = new PeruvianNuevoSol();
		countries[112] = new PhilippinePeso();
		countries[113] = new PolishZloty();
		countries[114] = new QatariRial();
		countries[115] = new RomanianLeu();
		countries[116] = new RussianRuble();
		countries[117] = new RwandanFranc();
		countries[118] = new SalvadoranColón();
		countries[119] = new SamoanTala();
		countries[120] = new SaudiRiyal();
		countries[121] = new SerbianDinar();
		countries[122] = new SeychelloisRupee();
		countries[123] = new SierraLeoneanLeone();
		countries[124] = new SingaporeDollar();
		countries[125] = new SlovakKoruna();
		countries[126] = new SolomonIslandsDollar();
		countries[127] = new SomaliShilling();
		countries[128] = new SouthAfricanRand();
		countries[129] = new SouthKoreanWon();
		countries[130] = new SpecialDrawingRights();
		countries[131] = new SriLankanRupee();
		countries[132] = new StHelenaPound();
		countries[133] = new SudanesePound();
		countries[134] = new SurinameseDollar();
		countries[135] = new SwaziLilangeni();
		countries[136] = new SwedishKrona();
		countries[137] = new SwissFranc();
		countries[138] = new SyrianPound();
		countries[139] = new SãoToméPríncipeDobra();
		countries[140] = new TajikistaniSomoni();
		countries[141] = new TanzanianShilling();
		countries[142] = new ThaiBaht();
		countries[143] = new TonganPaʻanga();
		countries[144] = new TrinidadTobagoDollar();
		countries[145] = new TunisianDinar();
		countries[146] = new TurkishLira();
		countries[147] = new TurkmenistaniManat();
		countries[148] = new UgandanShilling();
		countries[149] = new UkrainianHryvnia();
		countries[150] = new UnitedArabEmiratesDirham();
		countries[151] = new UnitedStates();
		countries[152] = new UruguayanPeso();
		countries[153] = new UzbekistaniSom();
		countries[154] = new VanuatuVatu();
		countries[155] = new VenezuelanBolívar();
		countries[156] = new VietnameseDong();
		countries[157] = new WestAfricanCFAFranc();




		final JComboBox<?> CountriesList = new JComboBox(countries);
		final JComboBox CountriesList2 = new JComboBox(countries);
		CountriesList.setSelectedIndex(157);


		JPanel center = new JPanel();
		center.add(CountriesList);
		center.add(CountriesList2);
		textField1 = new JTextField(10);
		textField2 = new JTextField(10);
		south.add(textField1);
		south.add(click);
		south.add(textField2);

		frame.add(center, BorderLayout.CENTER);

		// make app terminate when the window is close
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

		class ClickHandler implements ActionListener {
			public void actionPerformed(ActionEvent ev) {
				double D = Double.parseDouble(textField1.getText());
				Countries from = (Countries) CountriesList.getSelectedItem();
				Countries to = (Countries) CountriesList2.getSelectedItem();
				double E = Math.round(D *to.rate()/ from.rate()* 100.0) /100.0 ;
				textField2.setText(Double.toString(E));

			}
		}
		// register the button
		ClickHandler handler = new ClickHandler();
		click.addActionListener(handler);


		}




	public static void main(String[] args) {

		new CurrencyExchange();

	}
}
