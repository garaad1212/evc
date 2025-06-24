import  java.util.Scanner;
public class evcplus {
//meshaan wa mesha uu calling ka dhaacyo step one
 private static String[] mainMenuOptions = {
"1. Itus Haraaga",
"2. kaarka hadalka",
"3. Bixi Biil",
"4. U wareeji EVCPLUS",
"5. Warbixin Kooban",
"6. Salaam Bank",
"7. Maareynta",
"8. TAAJ",
"9. Bill Payment"
};
//meshan wa mesha caling ka dhcyo marki ad doorato 2. o ah karka hadalaka//
private static String[] airtimeOptions = {
"1. Ku shubo Airtime",
"2. Ugu shubo Airtime",
"3. MIFI Packages",
"4. Ku shubo Internet",
"5. Ugu shub qof kale (MMT)"
};

private static double[] mifiWeeklyPackages = {5.0, 10.0};
private static String[] mifiWeeklyDescriptions = {"$5= 10 GB", "$10=25 GB"};


public static void displayMainMenu() {
System.out.println("EVCPLUS");
for (String option : mainMenuOptions) {
System.out.println(option);
}
System.out.print("Fadlan dooro adeeg (1-9): ");
}
//mesdhaan waa fuction ka dhacyey//
public static void displayBalance(double balance) {
System.out.println("[-EVCPLUS-] Haraagaagu waa $" + balance);
}

public static void displayAirtimeMenu() {
System.out.println("Kaarka hadalka");
for (String option : airtimeOptions) {
System.out.println(option);
}
System.out.print("Fadlan dooro adeeg (1-5): ");
}

public static void displayMifiWeeklyPackages() {
System.out.println("fadlan dooro bundle ka");
for (int i = 0; i < mifiWeeklyPackages.length; i++) {
System.out.println((i+1) + ". " + mifiWeeklyDescriptions[i]);
}
}

public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("soo Geli *770#");
String dail_up = input.next();
String dail = "*770#";
int pass = 2222;
double balance = 1000;

if (!dail_up.equals(dail)) {
System.out.println("waa khalad");
return;
}
// medhaan waa function kowaaad//
System.out.println("- EVCPLUS -");
System.out.println("faldan geli pin-kaaga(Enter pin)");
int user_pass = input.nextInt();

if (pass != user_pass) {
System.out.println("Pinka waa khalad");
return;
}

displayMainMenu();
int dooro = input.nextInt();

switch (dooro) {
case 1:
displayBalance(balance);
break;
// meshan  function labaad//
case 2:
displayAirtimeMenu();
int kaarka_hadalka = input.nextInt();

switch (kaarka_hadalka) {
case 1:
System.out.println("Fadlan Gali lacagta");
double kaarka_lacgta = input.nextDouble();
System.out.println("Fadlan Geli numberka");
int mob_kaarka = input.nextInt();
System.out.println("Ma hubtaa inaad $" + kaarka_lacgta + " ku shubtid undefined?");
System.out.println("1. haa");
System.out.println("2. maya");
int hubin = input.nextInt();

switch (hubin) {
case 1:
if (balance >= kaarka_lacgta) {
System.out.println("waad guuleysady inaa lacagta u shubto" + mob_kaarka + " \n haraagaga hada waa $" + (balance - kaarka_lacgta));
} else {
System.out.println("haraagagu kuma filano");
}
break;
case 2:
System.out.println("OK");
break;
}
break;

case 2:
System.out.println("Fadlan Geli mobile-ka");
int num_qofka = input.nextInt();
System.out.println("Fadlan Geli lacagta");
double qofka_lcgta = input.nextDouble();

System.out.println("Ma hubtaa inaad $" + qofka_lcgta + " ku shubtid " + num_qofka + "?");
System.out.println("1. haa");
System.out.println("2. maya");
int ugushubo_hubin = input.nextInt();

switch (ugushubo_hubin) {
case 1:
if (balance >= qofka_lcgta) {
System.out.println("waad guuleysady inaa lacagta u shubtid " + num_qofka + " \n haraagaga hada waa $" + (balance - qofka_lcgta));
} else {
System.out.println("haraagagu kuma filano");
}
break;
case 2:
System.out.println("OK");
break;
}
break;

case 3:
System.out.println("EVCPlus");
System.out.println("1. Ku shubo Data-da MIFI");
int data = input.nextInt();

if (data == 1) {
System.out.println("-Internet Bundle Recharge-");
System.out.println("1. Isbuucle(Weekly)");
System.out.println("2. maalinle(Daily)");
System.out.println("3. Bille(MiFi)");
int MIFI = input.nextInt();

switch (MIFI) {
case 1:
displayMifiWeeklyPackages();
double lacgta_1 = 5;
double lacgta_2 = 10;
int isbuucle = input.nextInt();

switch (isbuucle) {
case 1:
System.out.println("fadlan Gali MIFI user");
int isbucle_user = input.nextInt();
System.out.println("Ma hubtaa inaad $" + lacgta_1 + " ugu shubtid " + isbucle_user + " ?");
System.out.println("1. haa");
System.out.println("2. maya");
int isbucle_hubin = input.nextInt();

switch (isbucle_hubin) {
    case 1:
        System.out.println("waad ku guuleysaday inaad ku shubtid $5 isbuucle ah" + " \n haraagaga hada waa $" + (balance - lacgta_1));
        break;
    case 2:
        System.out.println("ok");
        break;
    default:
        System.out.println("number sax soo gali");
}
break;

case 2:
System.out.println("fadlan Gali MIFI user");
int user_isbucle = input.nextInt();
System.out.println("Ma hubtaa inaad $" + lacgta_2 + " ugu shubtid " + user_isbucle + " ?");
System.out.println("1. haa");
System.out.println("2. maya");
int Isubcle_hubin = input.nextInt();

switch (Isubcle_hubin) {
    case 1:
        System.out.println("waad ku guuleysaday inaad ku shubtid $10 isbuucle ah" + " \n haraagaga hada waa $" + (balance - lacgta_2));
        break;
    case 2:
        System.out.println("ok");
        break;
    default:
        System.out.println("number sax soo gali");
}
break;

default:
System.out.println("number sax ah dooro ");
}
break;

case 2:
System.out.println("fadlan dooro bundle ka");
System.out.println("1. $1= 2 GB ");
System.out.println("2. $2=5 GB ");
double malinle_1 = 2;
double malinle_2 = 5;
int malinle = input.nextInt();

switch (malinle) {
case 1:
System.out.println("fadlan Gali MIFI user");
int mlnle_user = input.nextInt();
System.out.println("Ma hubtaa inaad $" + malinle_1 + " ugu shubtid " + mlnle_user + " ?" + " \n haraagaga hada waa $" + (balance - malinle_1));
System.out.println("1. haa");
System.out.println("2. maya");
int Mlnle_hubin = input.nextInt();

switch (Mlnle_hubin) {
    case 1:
        System.out.println("waad ku guuleysaday inaad ku shubtid $2 maalinle ah" + " \n haraagaga hada waa $" + (balance - malinle_1));
        break;
    case 2:
        System.out.println("ok");
        break;
    default:
        System.out.println("number sax soo gali");
}
break;

case 2:
System.out.println("fadlan Gali MIFI user");
int user_malnle = input.nextInt();
System.out.println("Ma hubtaa inaad $" + malinle_2 + " ugu shubtid " + user_malnle + " ?");
System.out.println("1. haa");
System.out.println("2. maya");
int mlnle_hubin = input.nextInt();

switch (mlnle_hubin) {
    case 1:
        System.out.println("waad ku guuleysaday inaad ku shubtid $2 maalinle ah" + " \n haraagaga hada waa $" + (balance - malinle_2));
        break;
    case 2:
        System.out.println("ok");
        break;
    default:
        System.out.println("number sax soo gali");
}
break;

default:
System.out.println("number sax ah dooro ");
}
break;

case 3:
System.out.println("fadlan dooro bundle ka");
System.out.println("1. $20= 40 GB ");
System.out.println("2. $40=85 GB ");
System.out.println("3. $60= 150 GB ");
System.out.println("4. $30= monthly unlimit ");
double bille_1 = 20;
double bille_2 = 40;
double bille_3 = 60;
double bille_4 = 30;
int bille = input.nextInt();

switch (bille) {
case 1:
System.out.println("fadlan Gali MIFI user");
int user_1 = input.nextInt();
System.out.println("Ma hubtaa inaad $" + bille_1 + " ugu shubtid " + user_1 + " ?");
System.out.println("1. haa");
System.out.println("2. maya");
int Bille_hubin1 = input.nextInt();

switch (Bille_hubin1) {
    case 1:
        System.out.println("waad ku guuleysaday inaad ku shubtid $20 bille ah" + " \n haraagaga hada waa $" + (balance - bille_1));
        break;
    case 2:
        System.out.println("ok");
        break;
    default:
        System.out.println("number sax soo gali");
}
break;

case 2:
System.out.println("fadlan Gali MIFI user");
int user_2 = input.nextInt();
System.out.println("Ma hubtaa inaad $" + bille_2 + " ugu shubtid " + user_2 + " ?");
System.out.println("1. haa");
System.out.println("2. maya");
int Bille_hubin2 = input.nextInt();

switch (Bille_hubin2) {
    case 1:
        System.out.println("waad ku guuleysaday inaad ku shubtid $40 bille ah" + " \n haraagaga hada waa $" + (balance - bille_2));
        break;
    case 2:
        System.out.println("ok");
        break;
    default:
        System.out.println("number sax soo gali");
}
break;

case 3:
System.out.println("fadlan Gali MIFI user");
int user_3 = input.nextInt();
System.out.println("Ma hubtaa inaad $" + bille_3 + " ugu shubtid " + user_3 + " ?");
System.out.println("1. haa");
System.out.println("2. maya");
int Bille_hubin3 = input.nextInt();

switch (Bille_hubin3) {
    case 1:
        System.out.println("waad ku guuleysaday inaad ku shubtid $60 bille ah" + " \n haraagaga hada waa $" + (balance - bille_3));
        break;
    case 2:
        System.out.println("ok");
        break;
    default:
        System.out.println("number sax soo gali");
}
break;

case 4:
System.out.println("fadlan Gali MIFI user");
int user_4 = input.nextInt();
System.out.println("Ma hubtaa inaad $" + bille_4 + " ugu shubtid " + user_4 + " ?");
System.out.println("1. haa");
System.out.println("2. maya");
int Bille_hubin4 = input.nextInt();

switch (Bille_hubin4) {
    case 1:
        System.out.println("waad ku guuleysaday inaad ku shubtid $30 monthnly unlimit" + " \n haraagaga hada waa $" + (balance - bille_4));
        break;
    case 2:
        System.out.println("ok");
        break;
    default:
        System.out.println("number sax soo gali");
}
break;
}
break;

default:
System.out.println(" fadlan dooro number sax ah");
}
} else {
System.out.println(" fadlan dooro number sax ah");
}
break;

case 4:
System.out.println("Fadlan dooro number-ka ku shubeyso");
System.out.println("1. Isbuucle(Weekly)");
System.out.println("2.TIMES BASED PACKAGES");
System.out.println("3. DATA");
System.out.println("4. Maalinle (Daily)");
System.out.println("5. Bille(MiFi)");
int ku_shubo_intenet = input.nextInt();

switch (ku_shubo_intenet) {
case 1:
System.out.println("fadlan geli lacagta");
double Lcgta_shubo = input.nextDouble();
System.out.println("fadlan gali mobile-ka");
int Mob_user = input.nextInt();

System.out.println("Ma hubtaa inaad $" + Lcgta_shubo + " ugu shubtid " + Mob_user + " ?");
System.out.println("1. haa");
System.out.println("2. maya");
int _datahubin = input.nextInt();

switch (_datahubin) {
case 1:
if (balance >= Lcgta_shubo) {
System.out.println("waad ku guuleysaday inaad ku shubtid $" + Lcgta_shubo + " data internet-ah" + " \n haraagaga hada waa $" + (balance - Lcgta_shubo));
} else {
System.out.println("haragaagu kuma filno");
}
break;
case 2:
System.out.println("ok");
break;
default:
System.out.println("number sax soo gali");
}
break;

case 2:
System.out.println("fadlan geli lacagta");
double times_based = input.nextDouble();
System.out.println("fadlan gali mobile-ka");
int Mobile_user = input.nextInt();

System.out.println("Ma hubtaa inaad $" + times_based + " ugu shubtid " + Mobile_user + " ?");
System.out.println("1. haa");
System.out.println("2. maya");
int HUBIN = input.nextInt();

switch (HUBIN) {
case 1:
if (balance >= times_based) {
System.out.println("waad ku guuleysaday inaad ku shubtid $" + times_based + " data internet-ah" + " \n haraagaga hada waa $" + (balance - times_based));
} else {
System.out.println("haragaagu kuma filno");
}
break;
case 2:
System.out.println("ok");
break;
default:
System.out.println("number sax soo gali");
}
break;

case 3:
System.out.println("fadlan geli lacagta");
double Time_data = input.nextDouble();
System.out.println("fadlan gali mobile-ka");
int Mobile_users = input.nextInt();

System.out.println("Ma hubtaa inaad $" + Time_data + " ugu shubtid " + Mobile_users + " ?");
System.out.println("1. haa");
System.out.println("2. maya");
int HUBIN_dooro = input.nextInt();

switch (HUBIN_dooro) {
case 1:
if (balance >= Time_data) {
System.out.println("waad ku guuleysaday inaad ku shubtid $" + Time_data + " data internet-ah" + " \n haraagaga hada waa $" + (balance - Time_data));
} else {
System.out.println("haragaagu kuma filno");
}
break;
case 2:
System.out.println("ok");
break;
default:
System.out.println("number sax soo gali");
}
break;

case 4:
System.out.println("fadlan soo geli lacagta");
double daily = input.nextInt();
System.out.println("fadlan soo geli mobile-ka");
int mob_input = input.nextInt();
System.out.println("Ma hubtaa inaad $" + daily + " ugu shubtid " + mob_input + " ?");
System.out.println("1. haa");
System.out.println("2. maya");
int HBN = input.nextInt();

switch (HBN) {
case 1:
if (balance >= daily) {
System.out.println("waad ku guuleysaday inaad ku shubtid $" + daily + " data internet-ah" + " \n haraagaga hada waa $" + (balance - daily));
} else {
System.out.println("haragaagu kuma filno");
}
break;
case 2:
System.out.println("ok");
break;
default:
System.out.println("number sax soo gali");
}
break;

case 5:
System.out.println("fadlan soo geli lacagta");
double monthly = input.nextInt();
System.out.println("fadlan soo geli mobile-ka");
int Mob_input = input.nextInt();

System.out.println("Ma hubtaa inaad $" + monthly + " ugu shubtid " + Mob_input + " ?");
System.out.println("1. haa");
System.out.println("2. maya");
int _HUBIN = input.nextInt();

switch (_HUBIN) {
case 1:
if (balance >= monthly) {
System.out.println("waad ku guuleysaday inaad ku shubtid $" + monthly + " data internet-ah oo bile ah" + " \n haraagaga hada waa $" + (balance - monthly));
} else {
System.out.println("haragaagu kuma filno");
}
break;
case 2:
System.out.println("ok");
break;
default:
System.out.println("number sax ah soo geli");
}
break;

default:
System.out.println("number sax ah soo geli");
}
break;

case 5:
System.out.println("fadlan soo geli mobile-ka");
int qofka_kale = input.nextInt();
System.out.println("fadlan soo geli lacagta");
double lcgta_qofka = input.nextInt();

System.out.println("Ma hubtaa inaad $" + lcgta_qofka + " ugu shubtid " + qofka_kale + " ?");
System.out.println("1. haa");
System.out.println("2. maya");
int hubin_dooro = input.nextInt();

switch (hubin_dooro) {
case 1:
if (balance >= lcgta_qofka) {
System.out.println("waad ku guuleysaday inaad ugu shubtid " + qofka_kale + " \n haraagaga hada waa $" + (balance - lcgta_qofka));
} else {
System.out.println("haraagagu kuma filno");
}
case 2:
System.out.println("ok");
break;
default:
System.out.println("number sax ah soo geli");
}
break;

default:
System.out.println(" fadlan number sax soo dooro");
}
break;
// meshaan waa function sedexaaad//
case 3:
System.out.println("Bixi Biil");
System.out.println("1. Post Paid  ");
System.out.println("2.ku Iibso");
System.out.println("fadlan dooro adeega (1-2");
int bixi_biil = input.nextInt();

switch (bixi_biil) {
case 1:
System.out.println("Post Paid");
System.out.println("1. Ogow biil");
System.out.println("2. Bixi biil");
System.out.println("3.Ka Bixi Biil");

int post_paid = input.nextInt();

switch (post_paid) {
case 1:
System.out.println("haraagagu waa $" + balance);
break;

case 2:
System.out.println("Fadlan geli lacagta biil-ka");
int biilka_lcgta = input.nextInt();
System.out.println("Ma hubtaa inaa bixisid biil lacagtiisu tahay: $" + biilka_lcgta);
System.out.println("1.haa ");
System.out.println("2. maya");
int ogoow_biil = input.nextInt();

switch (ogoow_biil) {
case 1:
if (balance >= biilka_lcgta) {
System.out.println("waad ku guuleysay inaa bixiso biilka \n haraagagu hada waa $" + (balance - biilka_lcgta));
} else {
System.out.println("haragaagu kuma filno");
}
break;
case 2:
System.out.println("ok");
break;
default:
System.out.println("fadlan soo geli number sax ah");
}
break;
// meshaan waa function afaraad//
case 3:
System.out.println("fadlan soo geli mobile-ka");
int mob_bixi = input.nextInt();
System.out.println("fadlan geli lacgta");
int lcgta_bixi = input.nextInt();
System.out.println("Ma hubtaa inaad bixisid bill lacagtiisu tahay: $" + lcgta_bixi + " oo laga rabo tell NO " + mob_bixi);
System.out.println("1.haa");
System.out.println("2. maya");
int ka_bixi_biil = input.nextInt();

switch (ka_bixi_biil) {
case 1:
if (balance >= lcgta_bixi) {
System.out.println("waad ku guuleysay inaad bixiso lacagta \n haragaagu hada waa $" + (balance - lcgta_bixi));
} else {
System.out.println("haragaagu kuma filno ");
}
break;
case 2:
System.out.println("ok");
break;
default:
System.out.println("fadlan soo geli number sax ah");
}
break;

default:
System.out.println("fadlan soo geli number sax ah");
}
break;

case 2:
int aqoonsiga = 2233;
System.out.println("Fadlan geli agoonsiga ganacsiga");
double aqoonsi = input.nextDouble();

if (aqoonsi == aqoonsiga) {
System.out.println("Fadlan Gali Number ka");
int number = input.nextInt();
System.out.println("Fadlan Gali lacagta");
double money = input.nextDouble();

if (money <= balance) {
System.out.println("Ma hubtaa inaad " + money + " udirto " + number + "\n" + "1.haa\n" + "2.maya");
int ku_iibso = input.nextInt();

if (ku_iibso == 1) {
balance -= money;
System.out.println("waad ku guuleystay howshaan\n" + "Haraagaagu waa " + balance);
} else {
System.out.println("Mahadsanid");
}
} else {
System.out.println("Haraagaaga kuguma filna");
break;
}
} else {
System.out.println("aqoonsigaaga waa qalad");
}
break;

default:
System.out.println("fadlan soo geli number sax ah");
}
break;

case 4:
System.out.println("fadlan geli mobile-ka");
int tell = input.nextInt();
System.out.println("fadaln geli lacagta");
double lcgta_uwareejinka = input.nextDouble();

System.out.println("Ma hubtaa inaad $" + lcgta_uwareejinka + " ugu shubtid " + tell + " ?");
System.out.println("1. haa");
System.out.println("2. maya");
int hubin_uwareejida = input.nextInt();

switch (hubin_uwareejida) {
case 1:
if (balance >= lcgta_uwareejinka) {
System.out.println(lcgta_uwareejinka + " $ ayaad uwareejisay " + tell + "\n haraagaga hada waa $" + (balance - lcgta_uwareejinka));
} else {
System.out.println("haraagagu kuma filno ");
}
break;

case 2:
System.out.println("ok");
break;

default:
System.out.println("number sax ah soo geli");
}
break;
/// meshan waa function shanaad//
case 5:
System.out.println("Warbixin Kooban");
System.out.println("1. Last Action ");
System.out.println("2. Wareejintii u dambeysay");
System.out.println("3.Iibsashadii u dambeysay");
System.out.println("4.Last 3 Action");
System.out.println("5. Email Me My ACtivity");
int warbixin_kooban = input.nextInt();

switch (warbixin_kooban) {
case 1:
System.out.println("$100 Ayaad u wareejisay +252615168899, Taariikh: 15/05/25 136:03:15");
break;

case 2:
System.out.println("Statementiga");
System.out.println("1. U dirtay");
System.out.println("2.kaheshay");
int statement = input.nextInt();

switch (statement) {
case 1:
System.out.println("fadlan geli mobile-ka");
int dirtay = input.nextInt();
System.out.println("$19 Ayaad ka dirtay +252" + dirtay + ", Taariikh: 15/05/245 19:03:16");
break;

case 2:
System.out.println("fadlan geli mobile-ka");
int kaheshay = input.nextInt();
System.out.println("$19 Ayaad ka heshay +252" + kaheshay + ", Taariikh: 15/05/25 19:03:16");
break;

default:
System.out.println("fadlan soo geli number ah");
}
break;

case 3:
break;

case 4:
System.out.println("$100 Ayaad u wareejisay +252617686664, Taariikh: 15/05/25 19:03:15");
System.out.println("$50 Ayaad u wareejisay +252614242430, Taariikh: 15/05/25 19:27:15");
System.out.println("$120 Ayaad u wareejisay +252615488130, Taariikh: 15/05/25 19:28:15");
break;

case 5:
System.out.println("codsigaa waxa la aqbalay waxana howsha lagugu so diridona email ahan  maxamedgaraad13@gmail.com");
break;

default:
System.out.println("fadlan soo geli number sax ah");
}
break;
/// meshaan waa function lixaaad//
case 6:
System.out.println("Salaam Bank");
System.out.println("1. Itus haraaga");
System.out.println("2. Lacag dhigasho");
System.out.println("3. Lacag qaadasho");
System.out.println("4. Ka wareeji EVCPlus");
System.out.println("5. Ka wareeji Account-kaga");
System.out.println("6. hubi wareeji account");
System.out.println("7. Maareynta Bankiga");
System.out.print("Fadlan dooro adeeg (1-7): ");
int ac_pass = 112233;
double ac_balance = 2000;

int salam_bank = input.nextInt();

switch (salam_bank) {
case 1:
System.out.println("Fadlan Geli numberkaaga sirta ee bangiga");
int num_sirta = input.nextInt();

if (num_sirta == ac_pass) {
System.out.println("haragaaga bangiga waa:" + ac_balance + "USD");
} else {
System.out.println("numberkaaga sirta ee bangiga waa qalad");
}
break;

case 2:
System.out.println("fadlan geli lacagta");
int lcg_dhigasho = input.nextInt();
System.out.println("Fadlan Geli numberkaaga sirta ee bangiga");
int num_sirt1 = input.nextInt();

if (num_sirt1 == ac_pass) {
System.out.println("Ma hubtaa inaad $" + lcg_dhigasho + " dhigatid account_kaaga bangiga ? \n 1.haa \n 2.mya");
int dhigasho_hubin = input.nextInt();

switch (dhigasho_hubin) {
case 1:
if (ac_balance >= lcg_dhigasho) {
System.out.println("USD " + lcg_dhigasho + " ayaa dhigatay koontadaada bangiga" + "\n haragaagu hada waa: $" + (ac_balance + lcg_dhigasho));
} else {
System.out.println("haragaagu kuma filno");
}
break;
case 2:
System.out.println("ok");
break;
default:
System.out.println("number sax ah soo geli");
}
} else {
System.out.println("numberkaaga sirta ee bangiga waa qalad");
}
break;

case 3:
System.out.println("fadlan geli lacagta");
int lcg_qaadasho = input.nextInt();
System.out.println("Fadlan Geli numberkaaga sirta ee bangiga");
int num_sirt2 = input.nextInt();

if (num_sirt2 == ac_pass) {
System.out.println("Ma hubtaa inaad $" + lcg_qaadasho + " qaadatid account_kaaga bangiga ? \n 1.haa \n 2.mya");
int qaadasho_hubin = input.nextInt();

switch (qaadasho_hubin) {
case 1:
if (ac_balance >= lcg_qaadasho) {
System.out.println("USD " + lcg_qaadasho + " ayaa kala baxday koontadaada bangiga" + "\n haragaagu hda waa: $" + (ac_balance - lcg_qaadasho));
} else {
System.out.println("haragaagu kuma filno");
}
break;
case 2:
System.out.println("ok");
break;
default:
System.out.println("number sax ah soo geli");
}
} else {
System.out.println("numberkaaga sirta ee bangiga waa qalad");
}
break;

case 4:
System.out.println("fadlan soo dooro xisaabta bangiga");
System.out.println("SALAAM SOMALI BANK");
int salaam_dooro = input.nextInt();

if (salaam_dooro == 1) {
System.out.println("fadlan soo geli account-ka");
int account = input.nextInt();
System.out.println("fadlan geli macluumad");
int macluumad = input.nextInt();
System.out.println("fadlan soo geli lacagta");
double LCGTA = input.nextDouble();
System.out.println("Fadlan Geli numberkaaga sirta ee bangiga");
int num_sirt3 = input.nextInt();

if (num_sirt3 == ac_pass) {
System.out.println("Ma hubtaa inaa u dhigatay  accounta NO:" + account + " ? \n 1.Haa \n 2. Maya");
int Dooro = input.nextInt();

switch (Dooro) {
case 1:
if (balance >= LCGTA) {
System.out.println("waad ku guuleysay inaa dhigato  ACCOUNT NO:" + account);
} else {
System.out.println("haragagu kuma filno");
}
break;
case 2:
System.out.println("mahadsanid!");
break;
default:
System.out.println("fadlan soo geli number sax ah");
}
} else {
System.out.println("fadlan soo dooro number sax ah ");
}
} else {
System.out.println("numberkaaga sirta ee bangiga waa qalad");
}
break;

case 5:
System.out.println("fadlan soo geli account ama mobile");
int account = input.nextInt();
System.out.println("fadlan soo geli lacagta");
double Lcgta1 = input.nextDouble();
System.out.println("fadlan soo geli macluumad");
String macluumad1 = input.next();
System.out.println("Fadlan Geli numberkaaga sirta ee bangiga");
int num_sirt4 = input.nextInt();

if (num_sirt4 == ac_pass) {
System.out.println("Ma hubtaa inaad USB" + Lcgta1 + "u wareejiso Bank Account NO:" + account + "? \n 1.Haa \n 2. Maya");
int bixin = input.nextInt();

switch (bixin) {
case 1:
System.out.println("waad ku guuleysay inaad u wareejiso lacagtan");
break;
case 2:
System.out.println("mahadsanid!");
break;
default:
System.out.println("fadlan soo geli number sax ah");
}
} else {
System.out.println("numberkaaga sirta ee bangiga waa qalad");
}
break;

case 6:
System.out.println("fadlan geli OTP");
int otp = input.nextInt();
System.out.println("Ma hubtaa in aad aqbasho lacgta diridan \n 1.Haa \n 2.Maya");
int otp_hubin = input.nextInt();

switch (otp_hubin) {
case 1:
System.out.println("waad ku guuleysay inaa ku dirto lacgta account to account");
break;
case 2:
System.out.println("mahadsanid!");
break;
default:
System.out.println("fadlan soo geli number sax ah");
}
break;

case 7:
System.out.println(" Maareynta Bankiga");
System.out.println("1. Bedel PIN-ka Bangiga");
System.out.println("2.Bedel Passwordka Ebank");
int maareynta = input.nextInt();

switch (maareynta) {
case 1:
System.out.println("Fadlan Geli numberkaaga sirta ee bangiga");
int num_sirt5 = input.nextInt();
System.out.println("Fadlan Geli pin-ka cusub ee bangiga");
int num_sirt6 = input.nextInt();
System.out.println("hubi pin-ka cusub");
int num_sirt7 = input.nextInt();

if (num_sirt5 == ac_pass) {
if (num_sirt6 != num_sirt5) {
if (num_sirt6 == num_sirt7) {
System.out.println("waad ku guuleysay inaa badasho pin-kaaga bangiga");
} else {
System.out.println("fadlan iska hubi pin-kaga cusub");
}
} else {
System.out.println("fadlan iska hubi number sireed ka cusub inuusan la mid aheyn number sireed kaagi hore ee bangiga");
}
} else {
System.out.println("numberkaaga sirta ee bangiga waa qalad");
}
break;

case 2:
System.out.println("Fadlan Geli numberkaaga sirta ee bangiga");
int num_sirt8 = input.nextInt();
System.out.println("error occurred ,please try again later");
break;

default:
System.out.println("fadlan soo geli number sax ah");
}
break;

default:
System.out.println("fadlan soo geli number sax ah");
}
break;
///  meshaan function todobaad//
case 7:
System.out.println("Maareynta ");
System.out.println("1.Bedel Lambarka Sirta");
System.out.println("2. Bedel Luqadda");
System.out.println("3. Wargellin Mobile Lumay");
System.out.println("4. Lacag Xirasho");
System.out.println("5. U celli Lacag Qaldantay");
System.out.println("6. EnableMobileBanking");
System.out.print("Fadlan dooro adeeg (1-6): ");
int Maareynta = input.nextInt();

switch (Maareynta) {
case 1:
System.out.println("Fadlan Gelli PIN-Kaaga Cusub");
int PIN_Cusub = input.nextInt();
System.out.println("Hubi PIN-Kaaga Cusub");
int Hubi_Cusub = input.nextInt();

if (PIN_Cusub == Hubi_Cusub) {
System.out.println("<-EVCPlus-> Waad Ku guuleysatay in aad badasho PIN-kaaga");
} else {
System.out.println("Kuma aadan Guleysan inaad badasho pinkaaga");
}
break;

case 2:
System.out.println("Falan Dooro luqada");
System.out.println("1.English");
System.out.println("2. Soomaali");
int luqadda = input.nextInt();

switch (luqadda) {
case 1:
System.out.println("<-EVCPlus-> you are succesfully changed your language");
break;
case 2:
System.out.println("<-EVCPLus-> Waad ku guuleysatey inaad badasho luqadda");
break;
default:
System.out.println("fadlan soo geli number sax ah");
}
break;

case 3:
System.out.println("Fadlan Geli Mobile-ka lumay");
int mobile_lumay = input.nextInt();

System.out.println("Ma hubtaa in aad u diiwaan Geliso lumid number-kan " + mobile_lumay + "\n 1. haa \n 2. maya");
int mob_lumay = input.nextInt();

switch (mob_lumay) {
case 1:
System.out.println("waad ku guuleysay inaa u diiwan geliso mobile-lumay");
break;
case 2:
System.out.println("ok");
break;
default:
System.out.println("fadlan soo geli number sax ah");
}
break;

case 4:
System.out.println("fadlan Geli numberka khalad ah");
int num_khalad = input.nextInt();
System.out.println("faldan geli numberkii loo rabay");
int num_loo_rabay = input.nextInt();

if (num_khalad == num_loo_rabay) {
System.out.println("Ma hubtaa inaa aad xirto lacagtan ? \n 1. haa \n 2. maya");
int Lacag_Xirasho = input.nextInt();

switch (Lacag_Xirasho) {
case 1:
System.out.println("waad ku guuleysay inaa xirato lacagtaan");
break;
case 2:
System.out.println("ok");
break;
default:
System.out.println("fadlan geli number sax ah");
}
} else {
System.out.println("dhaqdhaaqaan ma ahan mid jira");
}
break;

case 5:
System.out.println("fadlan Geli aqoonsiga lacag diridda");
int mob_celis = input.nextInt();
System.out.println("Ma hubtaa in aad celiso lacgtan ? " + mob_celis);
int hubinta_lacgta_celis = input.nextInt();

switch (hubinta_lacgta_celis) {
case 1:
System.out.println("waad ku guuleysay inaa celiso lacagta");
break;
case 2:
System.out.println("ok");
break;
default:
System.out.println("number sax soo geli");
}
break;

case 6:
System.out.println("fadlan  geli  number-ka is diiwan gelinta");
int num_is_diiwan = input.nextInt();
System.out.println(num_is_diiwan + " Activation record was found");
break;

default:
System.out.println("fadlan soo geli number sax ah");
break;
}
break;
///  meshaan function sidedaad//
case 8:
double akoonlacg = 1000;
System.out.println("\"TAAJ" );
System.out.println("1. gudaha");
System.out.println("2.dibada");
System.out.println("3.ogoow khidmada");
System.out.println("4.macluumadka xawalada");
System.out.println("5.jooji xawalada");
System.out.println("6.fur xalawalada");

int Taaj = input.nextInt();


switch (Taaj) {
case 1:
case 2:
    System.out.println("waxa doorada shirkada");
    System.out.println( "1.E-SAHAL");
    System.out.println("2.E-TAAJ");
    int chat = input.nextInt();

System.out.println("Fadlan Geli Taleefanka qaataha");
int talefanka = input.nextInt();
input.nextLine();

System.out.println("Fadlan Geli Magaca qaataha oo seddexan");
String FullName = input.nextLine();

System.out.println("Fadlan Geli Magaca qaataha");
String fullName = input.nextLine();

System.out.println("Fadlan Geli Magaalada qaataha uu joogo");
String magaalada = input.nextLine();

System.out.println("Fadlan Geli lacagta");
double lacagta = input.nextDouble();

System.out.println("Khidmadda ma xisaabtada ayaa laga jarayaa?\n1. Haa\n2. Maya");
int confirm = input.nextInt();

if (confirm == 1) {
if (akoonlacg < lacagta) {
System.out.println("Haraagaagu kuguma filna");
} else {
akoonlacg -= lacagta;
System.out.println("Waxaad lacag $" + lacagta + " u dirtay " + fullName +
" oo jooga magaalada " + magaalada +
". Haraagaaga hadda waa $" + akoonlacg);
}
} else {
System.out.println("Lacag lama dirin. Waad ka laabatay.");
}
break;

case 3:
System.out.println("Fadlan dooro shirkada\n1. PAY TO EVCPLUS TMT\n2. TAAJ\n3. TaajPay");
int Ips = input.nextInt();

System.out.println("Fadlan Geli Taleefanka qaataha");
int taleefanka = input.nextInt();

System.out.println("Fadlan Geli Lacagta");
int lacagta3 = input.nextInt();

System.out.println("Mahubtaa inaad $" + lacagta3 + " u dirto tel No " + taleefanka + "?");
int confirm3 = input.nextInt();

if (confirm3 == 1) {
if (akoonlacg < lacagta3) {
System.out.println("Haraaga koontadan kuma filna");
} else {
akoonlacg -= lacagta3;
System.out.println("Waxaad $" + lacagta3 + " u dirtay tell No " + taleefanka);
System.out.println("Haraagaagu waa $" + akoonlacg);
}
} else {
System.out.println("Mahadsanid");
}
break;

case 6:
System.out.println("Fadlan Geli aqoonsiga lacag diridda");
int aqoonsiga = input.nextInt();

System.out.println("Fadlan Geli Macluumaad");
int macluumaad = input.nextInt();

if (macluumaad != aqoonsiga) {
System.out.println("Invalid Input match (length)");
} else {
String action = (Taaj == 4) ? "xirto" : (Taaj == 5) ? "joojiso" : "furto";
System.out.println("Mahubtaa in aad " + action + " aqoonsiga xawilaada " + aqoonsiga + "?");

int confirmFinal = input.nextInt();
if (confirmFinal == 1) {
System.out.println("Waxaad " + action + " lacagta aqoonsiga " + aqoonsiga);
} else {
System.out.println("Mahadsanid");
}
}
break;

default:
System.out.println("Fadlan dooro number sax ah");
break;
}
break;
///  mesdhaaan waa function ugun dambeyey oo ah segalaaad//
case 9:
int tixraac =  617686664;
int dhelitirnan = 5000;

System.out.println("EVCPlus");
System.out.println("1. Itus haraaga billka\n2. Wada bixi billka\n3. Qayb ka bixi billka");
int doorasho = input.nextInt();

if (doorasho < 1 || doorasho > 3) {
System.out.println("Fadlan dooro number sax ah");
} else {
System.out.println("Fadlan geli bill reference number:");
int userReference = input.nextInt();

if (userReference != tixraac) {
System.out.println("Some parameters are missing. Please check your request");
} else if (doorasho == 1) {
System.out.println("Haraagaaga billku waa $" + balance);
} else {
System.out.println("Fadlan geli lacagta billka:");
int billAmount = input.nextInt();
System.out.println("Ma hubtaa in aad " +
(doorasho == 2 ? "wada bixisay8" : "qayb ka bixisay") +
" lacagta billka una dirtay " + userReference + "?\n1. Haa \n2. Maya");
int xaqiiji = input.nextInt();

if (xaqiiji == 1) {
if (billAmount < 1 || billAmount > balance) {
System.out.println("Haraagaagu kuguma filna");
} else {
balance -= billAmount;
System.out.println("Waxaad " +
(doorasho == 2 ? "wada bixisay" : "qayb ka bixisay") +
" lacagta billka, waxaad na u dirtay " + userReference +
". Haraagaagu waa $" + balance);
}
} else {
System.out.println("Mahadsanid!");
}
}
}
break;
}
}
}