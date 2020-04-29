package br.com.stomach.recipe.ui.dashboard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DashboardViewModel extends ViewModel {

    String [][][] tabelaPeriodica = new String [10][20][6];
    String [][] vetorPauling = new String [20][4];
    String [][] vetorPaulingSort = new  String [20][5];
    String [][] tabelaSubniveis = new String [16][2];
    String [][] tableLevelMax = new String [8][3];
    String [] vetorElemento = new String [8];
    String [] vetorElementoKey = new String [8];
    int estavel;

    public String loadPeriodicTable () {
        int linha, coluna;
        String valor;

        tabelaPeriodica [1][1][0] = "H";
        tabelaPeriodica [1][1][1] = "1";
        tabelaPeriodica [1][1][2] = "G";
        tabelaPeriodica [1][1][3] = "H";
        tabelaPeriodica [1][1][4] = "Hidrogênio";
        tabelaPeriodica [1][1][5] = "1.01";
        tabelaPeriodica [1][18][0] = "He";
        tabelaPeriodica [1][18][1] = "2";
        tabelaPeriodica [1][18][2] = "G";
        tabelaPeriodica [1][18][3] = "G";
        tabelaPeriodica [1][18][4] = "Hélio";
        tabelaPeriodica [1][18][5] = "4.00";
        tabelaPeriodica [2][1][0] = "Li";
        tabelaPeriodica [2][1][1] = "3";
        tabelaPeriodica [2][1][2] = "S";
        tabelaPeriodica [2][1][3] = "M";
        tabelaPeriodica [2][1][4] = "Lítio";
        tabelaPeriodica [2][1][5] = "6.94";
        tabelaPeriodica [2][2][0] = "Be";
        tabelaPeriodica [2][2][1] = "4";
        tabelaPeriodica [2][2][2] = "S";
        tabelaPeriodica [2][2][3] = "M";
        tabelaPeriodica [2][2][4] = "Berílio";
        tabelaPeriodica [2][2][5] = "9.01";
        tabelaPeriodica [2][13][0] = "B";
        tabelaPeriodica [2][13][1] = "5";
        tabelaPeriodica [2][13][2] = "S";
        tabelaPeriodica [2][13][3] = "S";
        tabelaPeriodica [2][13][4] = "Boro";
        tabelaPeriodica [2][13][5] = "10.8";
        tabelaPeriodica [2][14][0] = "C";
        tabelaPeriodica [2][14][1] = "6";
        tabelaPeriodica [2][14][2] = "S";
        tabelaPeriodica [2][14][3] = "A";
        tabelaPeriodica [2][14][4] = "Carbono";
        tabelaPeriodica [2][14][5] = "12.00";
        tabelaPeriodica [2][15][0] = "N";
        tabelaPeriodica [2][15][1] = "7";
        tabelaPeriodica [2][15][2] = "G";
        tabelaPeriodica [2][15][3] = "A";
        tabelaPeriodica [2][15][4] = "Nitrogênio";
        tabelaPeriodica [2][15][5] = "14.00";
        tabelaPeriodica [2][16][0] = "O";
        tabelaPeriodica [2][16][1] = "8";
        tabelaPeriodica [2][16][2] = "G";
        tabelaPeriodica [2][16][3] = "A";
        tabelaPeriodica [2][16][4] = "Oxigênio";
        tabelaPeriodica [2][16][5] = "16.00";
        tabelaPeriodica [2][17][0] = "F";
        tabelaPeriodica [2][17][1] = "9";
        tabelaPeriodica [2][17][2] = "G";
        tabelaPeriodica [2][17][3] = "A";
        tabelaPeriodica [2][18][4] = "Flúor";
        tabelaPeriodica [2][18][5] = "19.00";
        tabelaPeriodica [2][18][0] = "Ne";
        tabelaPeriodica [2][18][1] = "10";
        tabelaPeriodica [2][18][2] = "G";
        tabelaPeriodica [2][18][3] = "G";
        tabelaPeriodica [2][18][4] = "Neônio";
        tabelaPeriodica [2][18][5] = "20.20";
        tabelaPeriodica [3][1][0] = "Na";
        tabelaPeriodica [3][1][1] = "11";
        tabelaPeriodica [3][1][2] = "S";
        tabelaPeriodica [3][1][3] = "M";
        tabelaPeriodica [3][1][4] = "Sódio";
        tabelaPeriodica [3][1][5] = "23.00";
        tabelaPeriodica [3][2][0] = "Mg";
        tabelaPeriodica [3][2][1] = "12";
        tabelaPeriodica [3][2][2] = "S";
        tabelaPeriodica [3][2][3] = "M";
        tabelaPeriodica [3][2][4] = "Magnésio";
        tabelaPeriodica [3][2][5] = "24.30";
        tabelaPeriodica [3][13][0] = "Al";
        tabelaPeriodica [3][13][1] = "13";
        tabelaPeriodica [3][13][2] = "S";
        tabelaPeriodica [3][13][3] = "M";
        tabelaPeriodica [3][13][4] = "Alumínio";
        tabelaPeriodica [3][13][5] = "27.00";
        tabelaPeriodica [3][14][0] = "Si";
        tabelaPeriodica [3][14][1] = "14";
        tabelaPeriodica [3][14][2] = "S";
        tabelaPeriodica [3][14][3] = "S";
        tabelaPeriodica [3][14][4] = "Silício";
        tabelaPeriodica [3][14][5] = "28.10";
        tabelaPeriodica [3][15][0] = "P";
        tabelaPeriodica [3][15][1] = "15";
        tabelaPeriodica [3][15][2] = "S";
        tabelaPeriodica [3][15][3] = "A";
        tabelaPeriodica [3][15][4] = "Fósforo";
        tabelaPeriodica [3][15][5] = "31.00";
        tabelaPeriodica [3][16][0] = "S";
        tabelaPeriodica [3][16][1] = "16";
        tabelaPeriodica [3][16][2] = "S";
        tabelaPeriodica [3][16][3] = "A";
        tabelaPeriodica [3][16][4] = "Enxofre";
        tabelaPeriodica [3][16][5] = "32.10";
        tabelaPeriodica [3][17][0] = "Cl";
        tabelaPeriodica [3][17][1] = "17";
        tabelaPeriodica [3][17][2] = "G";
        tabelaPeriodica [3][17][3] = "A";
        tabelaPeriodica [3][17][4] = "Cloro";
        tabelaPeriodica [3][17][5] = "35.50";
        tabelaPeriodica [3][18][0] = "Ar";
        tabelaPeriodica [3][18][1] = "18";
        tabelaPeriodica [3][18][2] = "G";
        tabelaPeriodica [3][18][3] = "G";
        tabelaPeriodica [3][18][4] = "Argônio";
        tabelaPeriodica [3][18][5] = "39.90";
        tabelaPeriodica [4][1][0] = "K";
        tabelaPeriodica [4][1][1] = "19";
        tabelaPeriodica [4][1][2] = "S";
        tabelaPeriodica [4][1][3] = "M";
        tabelaPeriodica [4][1][4] = "Potássio";
        tabelaPeriodica [4][1][5] = "39.10";
        tabelaPeriodica [4][2][0] = "Ca";
        tabelaPeriodica [4][2][1] = "20";
        tabelaPeriodica [4][2][2] = "S";
        tabelaPeriodica [4][2][3] = "M";
        tabelaPeriodica [4][2][4] = "Cálcio";
        tabelaPeriodica [4][2][5] = "40.10";
        tabelaPeriodica [4][3][0] = "Sc";
        tabelaPeriodica [4][3][1] = "21";
        tabelaPeriodica [4][3][2] = "S";
        tabelaPeriodica [4][3][3] = "M";
        tabelaPeriodica [4][3][4] = "Escândio";
        tabelaPeriodica [4][3][5] = "45.00";
        tabelaPeriodica [4][4][0] = "Ti";
        tabelaPeriodica [4][4][1] = "22";
        tabelaPeriodica [4][4][2] = "S";
        tabelaPeriodica [4][4][3] = "M";
        tabelaPeriodica [4][4][4] = "Titânio";
        tabelaPeriodica [4][4][5] = "47.90";
        tabelaPeriodica [4][5][0] = "V";
        tabelaPeriodica [4][5][1] = "23";
        tabelaPeriodica [4][5][2] = "S";
        tabelaPeriodica [4][5][3] = "M";
        tabelaPeriodica [4][5][4] = "Vanádio";
        tabelaPeriodica [4][5][5] = "50.90";
        tabelaPeriodica [4][6][0] = "Cr";
        tabelaPeriodica [4][6][1] = "24";
        tabelaPeriodica [4][6][2] = "S";
        tabelaPeriodica [4][6][3] = "M";
        tabelaPeriodica [4][6][4] = "Crômio";
        tabelaPeriodica [4][6][5] = "52.00";
        tabelaPeriodica [4][7][0] = "Mn";
        tabelaPeriodica [4][7][1] = "25";
        tabelaPeriodica [4][7][2] = "S";
        tabelaPeriodica [4][7][3] = "M";
        tabelaPeriodica [4][7][4] = "Manganés";
        tabelaPeriodica [4][7][5] = "54.90";
        tabelaPeriodica [4][8][0] = "Fe";
        tabelaPeriodica [4][8][1] = "26";
        tabelaPeriodica [4][8][2] = "S";
        tabelaPeriodica [4][8][3] = "M";
        tabelaPeriodica [4][8][4] = "Ferro";
        tabelaPeriodica [4][8][5] = "55.80";
        tabelaPeriodica [4][9][0] = "Co";
        tabelaPeriodica [4][9][1] = "27";
        tabelaPeriodica [4][9][2] = "S";
        tabelaPeriodica [4][9][3] = "M";
        tabelaPeriodica [4][9][4] = "Cobalto";
        tabelaPeriodica [4][9][5] = "58.90";
        tabelaPeriodica [4][10][0] = "Ni";
        tabelaPeriodica [4][10][1] = "28";
        tabelaPeriodica [4][10][2] = "S";
        tabelaPeriodica [4][10][3] = "M";
        tabelaPeriodica [4][10][4] = "Níquel";
        tabelaPeriodica [4][10][5] = "58.70";
        tabelaPeriodica [4][11][0] = "Cu";
        tabelaPeriodica [4][11][1] = "29";
        tabelaPeriodica [4][11][2] = "S";
        tabelaPeriodica [4][11][3] = "M";
        tabelaPeriodica [4][11][4] = "Cobre";
        tabelaPeriodica [4][11][5] = "63.50";
        tabelaPeriodica [4][12][0] = "Zn";
        tabelaPeriodica [4][12][1] = "30";
        tabelaPeriodica [4][12][2] = "S";
        tabelaPeriodica [4][12][3] = "M";
        tabelaPeriodica [4][12][4] = "Zinco";
        tabelaPeriodica [4][12][5] = "65.40";
        tabelaPeriodica [4][13][0] = "Ga";
        tabelaPeriodica [4][13][1] = "31";
        tabelaPeriodica [4][13][2] = "S";
        tabelaPeriodica [4][13][3] = "M";
        tabelaPeriodica [4][13][4] = "Gálio";
        tabelaPeriodica [4][13][5] = "69.70";
        tabelaPeriodica [4][14][0] = "Ge";
        tabelaPeriodica [4][14][1] = "32";
        tabelaPeriodica [4][14][2] = "S";
        tabelaPeriodica [4][14][3] = "S";
        tabelaPeriodica [4][14][4] = "Germânio";
        tabelaPeriodica [4][14][5] = "72.60";
        tabelaPeriodica [4][15][0] = "As";
        tabelaPeriodica [4][15][1] = "33";
        tabelaPeriodica [4][15][2] = "S";
        tabelaPeriodica [4][15][3] = "S";
        tabelaPeriodica [4][15][4] = "Arsênio";
        tabelaPeriodica [4][15][5] = "74.90";
        tabelaPeriodica [4][16][0] = "Se";
        tabelaPeriodica [4][16][1] = "34";
        tabelaPeriodica [4][16][2] = "S";
        tabelaPeriodica [4][16][3] = "A";
        tabelaPeriodica [4][16][4] = "Selênio";
        tabelaPeriodica [4][16][5] = "79.00";
        tabelaPeriodica [4][17][0] = "Br";
        tabelaPeriodica [4][17][1] = "35";
        tabelaPeriodica [4][17][2] = "L";
        tabelaPeriodica [4][17][3] = "A";
        tabelaPeriodica [4][17][4] = "Bromo";
        tabelaPeriodica [4][17][5] = "79.90";
        tabelaPeriodica [4][18][0] = "Kr";
        tabelaPeriodica [4][18][1] = "36";
        tabelaPeriodica [4][18][2] = "G";
        tabelaPeriodica [4][18][3] = "M";
        tabelaPeriodica [4][18][4] = "Criptônio";
        tabelaPeriodica [4][18][5] = "83.80";
        tabelaPeriodica [5][1][0] = "Rb";
        tabelaPeriodica [5][1][1] = "37";
        tabelaPeriodica [5][1][2] = "S";
        tabelaPeriodica [5][1][3] = "M";
        tabelaPeriodica [5][1][4] = "Rubídio";
        tabelaPeriodica [5][1][5] = "85.50";
        tabelaPeriodica [5][2][0] = "Sr";
        tabelaPeriodica [5][2][1] = "38";
        tabelaPeriodica [5][2][2] = "S";
        tabelaPeriodica [5][2][3] = "M";
        tabelaPeriodica [5][2][4] = "Estrôncio";
        tabelaPeriodica [5][2][5] = "87,60";
        tabelaPeriodica [5][3][0] = "Y";
        tabelaPeriodica [5][3][1] = "39";
        tabelaPeriodica [5][3][2] = "S";
        tabelaPeriodica [5][3][3] = "M";
        tabelaPeriodica [5][1][4] = "Ítrio";
        tabelaPeriodica [5][1][5] = "88,90";
        tabelaPeriodica [5][4][0] = "Zr";
        tabelaPeriodica [5][4][1] = "40";
        tabelaPeriodica [5][4][2] = "S";
        tabelaPeriodica [5][4][3] = "M";
        tabelaPeriodica [5][4][4] = "Zircônio";
        tabelaPeriodica [5][4][5] = "92.90";
        tabelaPeriodica [5][5][0] = "Nb";
        tabelaPeriodica [5][5][1] = "41";
        tabelaPeriodica [5][5][2] = "S";
        tabelaPeriodica [5][5][3] = "M";
        tabelaPeriodica [5][5][4] = "Nióbio";
        tabelaPeriodica [5][5][5] = "92.90";
        tabelaPeriodica [5][6][0] = "Mo";
        tabelaPeriodica [5][6][1] = "42";
        tabelaPeriodica [5][6][2] = "S";
        tabelaPeriodica [5][6][3] = "M";
        tabelaPeriodica [5][6][4] = "Molibdênio";
        tabelaPeriodica [5][6][5] = "95.90";
        tabelaPeriodica [5][7][0] = "Tc";
        tabelaPeriodica [5][7][1] = "43";
        tabelaPeriodica [5][7][2] = "S";
        tabelaPeriodica [5][7][3] = "M";
        tabelaPeriodica [5][7][4] = "Tecnécio";
        tabelaPeriodica [5][7][5] = "98.00";
        tabelaPeriodica [5][8][0] = "Ru";
        tabelaPeriodica [5][8][1] = "44";
        tabelaPeriodica [5][8][2] = "S";
        tabelaPeriodica [5][8][3] = "M";
        tabelaPeriodica [5][8][4] = "Rutênio";
        tabelaPeriodica [5][8][5] = "101.00";
        tabelaPeriodica [5][9][0] = "Rh";
        tabelaPeriodica [5][9][1] = "45";
        tabelaPeriodica [5][9][2] = "S";
        tabelaPeriodica [5][9][3] = "M";
        tabelaPeriodica [5][9][4] = "Ródio";
        tabelaPeriodica [5][9][5] = "103.00";
        tabelaPeriodica [5][10][0] = "Pd";
        tabelaPeriodica [5][10][1] = "46";
        tabelaPeriodica [5][10][2] = "S";
        tabelaPeriodica [5][10][3] = "M";
        tabelaPeriodica [5][10][4] = "Paládio";
        tabelaPeriodica [5][10][5] = "106.00";
        tabelaPeriodica [5][11][0] = "Ag";
        tabelaPeriodica [5][11][1] = "47";
        tabelaPeriodica [5][11][2] = "S";
        tabelaPeriodica [5][11][3] = "M";
        tabelaPeriodica [5][11][4] = "Prata";
        tabelaPeriodica [5][11][5] = "108.00";
        tabelaPeriodica [5][12][0] = "Cd";
        tabelaPeriodica [5][12][1] = "48";
        tabelaPeriodica [5][12][2] = "S";
        tabelaPeriodica [5][12][3] = "M";
        tabelaPeriodica [5][12][4] = "Cádmio";
        tabelaPeriodica [5][12][5] = "112.00";
        tabelaPeriodica [5][13][0] = "In";
        tabelaPeriodica [5][13][1] = "49";
        tabelaPeriodica [5][13][2] = "S";
        tabelaPeriodica [5][13][3] = "M";
        tabelaPeriodica [5][13][4] = "Índio";
        tabelaPeriodica [5][13][5] = "115.00";
        tabelaPeriodica [5][14][0] = "Sn";
        tabelaPeriodica [5][14][1] = "50";
        tabelaPeriodica [5][14][2] = "S";
        tabelaPeriodica [5][14][3] = "M";
        tabelaPeriodica [5][14][4] = "Estanho";
        tabelaPeriodica [5][14][5] = "119.00";
        tabelaPeriodica [5][15][0] = "Sb";
        tabelaPeriodica [5][15][1] = "51";
        tabelaPeriodica [5][15][2] = "S";
        tabelaPeriodica [5][15][3] = "S";
        tabelaPeriodica [5][15][4] = "Antimônio";
        tabelaPeriodica [5][15][5] = "122.00";
        tabelaPeriodica [5][16][0] = "Te";
        tabelaPeriodica [5][16][1] = "52";
        tabelaPeriodica [5][16][2] = "S";
        tabelaPeriodica [5][16][3] = "S";
        tabelaPeriodica [5][16][4] = "Telúrio";
        tabelaPeriodica [5][16][5] = "128.00";
        tabelaPeriodica [5][17][0] = "I";
        tabelaPeriodica [5][17][1] = "53";
        tabelaPeriodica [5][17][2] = "S";
        tabelaPeriodica [5][17][3] = "A";
        tabelaPeriodica [5][17][4] = "Iodo";
        tabelaPeriodica [5][17][5] = "127.00";
        tabelaPeriodica [5][18][0] = "Xe";
        tabelaPeriodica [5][18][1] = "54";
        tabelaPeriodica [5][18][2] = "G";
        tabelaPeriodica [5][18][3] = "G";
        tabelaPeriodica [5][18][4] = "Xenônio";
        tabelaPeriodica [5][18][5] = "131.00";
        tabelaPeriodica [6][1][0] = "Cs";
        tabelaPeriodica [6][1][1] = "55";
        tabelaPeriodica [6][1][2] = "S";
        tabelaPeriodica [6][1][3] = "M";
        tabelaPeriodica [6][1][4] = "Césio";
        tabelaPeriodica [6][1][5] = "133.00";
        tabelaPeriodica [6][2][0] = "Ba";
        tabelaPeriodica [6][2][1] = "56";
        tabelaPeriodica [6][2][2] = "S";
        tabelaPeriodica [6][2][3] = "M";
        tabelaPeriodica [6][2][4] = "Bário";
        tabelaPeriodica [6][2][5] = "137.00";
        tabelaPeriodica [6][3][0] = "La";
        tabelaPeriodica [6][3][1] = "57";
        tabelaPeriodica [6][3][2] = "S";
        tabelaPeriodica [6][3][3] = "M";
        tabelaPeriodica [6][3][4] = "Lantânio";
        tabelaPeriodica [6][3][5] = "139.00";
        tabelaPeriodica [6][4][0] = "Hf";
        tabelaPeriodica [6][4][1] = "72";
        tabelaPeriodica [6][4][2] = "S";
        tabelaPeriodica [6][4][3] = "M";
        tabelaPeriodica [6][4][4] = "Háfnio";
        tabelaPeriodica [6][4][5] = "178.00";
        tabelaPeriodica [6][5][0] = "Ta";
        tabelaPeriodica [6][5][1] = "73";
        tabelaPeriodica [6][5][2] = "S";
        tabelaPeriodica [6][5][3] = "M";
        tabelaPeriodica [6][5][4] = "Tantálio";
        tabelaPeriodica [6][5][5] = "181.00";
        tabelaPeriodica [6][6][0] = "W";
        tabelaPeriodica [6][6][1] = "74";
        tabelaPeriodica [6][6][2] = "S";
        tabelaPeriodica [6][6][3] = "M";
        tabelaPeriodica [6][6][4] = "Tungstênio";
        tabelaPeriodica [6][6][5] = "184.00";
        tabelaPeriodica [6][7][0] = "Re";
        tabelaPeriodica [6][7][1] = "75";
        tabelaPeriodica [6][7][2] = "S";
        tabelaPeriodica [6][7][3] = "M";
        tabelaPeriodica [6][7][4] = "Rênio";
        tabelaPeriodica [6][7][5] = "186.00";
        tabelaPeriodica [6][8][0] = "Os";
        tabelaPeriodica [6][8][1] = "76";
        tabelaPeriodica [6][8][2] = "S";
        tabelaPeriodica [6][8][3] = "M";
        tabelaPeriodica [6][8][4] = "Ósmio";
        tabelaPeriodica [6][8][5] = "190.00";
        tabelaPeriodica [6][9][0] = "Ir";
        tabelaPeriodica [6][9][1] = "77";
        tabelaPeriodica [6][9][2] = "S";
        tabelaPeriodica [6][9][3] = "M";
        tabelaPeriodica [6][9][4] = "Irídio";
        tabelaPeriodica [6][9][5] = "192.00";
        tabelaPeriodica [6][10][0] = "Pt";
        tabelaPeriodica [6][10][1] = "78";
        tabelaPeriodica [6][10][2] = "S";
        tabelaPeriodica [6][10][3] = "M";
        tabelaPeriodica [6][10][4] = "Platina";
        tabelaPeriodica [6][10][5] = "195.00";
        tabelaPeriodica [6][11][0] = "Au";
        tabelaPeriodica [6][11][1] = "79";
        tabelaPeriodica [6][11][2] = "S";
        tabelaPeriodica [6][11][3] = "M";
        tabelaPeriodica [6][11][4] = "Ouro";
        tabelaPeriodica [6][11][5] = "197.00";
        tabelaPeriodica [6][12][0] = "Hg";
        tabelaPeriodica [6][12][1] = "80";
        tabelaPeriodica [6][12][2] = "L";
        tabelaPeriodica [6][12][3] = "M";
        tabelaPeriodica [6][12][4] = "Mercúrio";
        tabelaPeriodica [6][12][5] = "201";
        tabelaPeriodica [6][13][0] = "Tl";
        tabelaPeriodica [6][13][1] = "81";
        tabelaPeriodica [6][13][2] = "S";
        tabelaPeriodica [6][13][3] = "M";
        tabelaPeriodica [6][13][4] = "Tálio";
        tabelaPeriodica [6][13][5] = "204.00";
        tabelaPeriodica [6][14][0] = "Pb";
        tabelaPeriodica [6][14][1] = "82";
        tabelaPeriodica [6][14][2] = "S";
        tabelaPeriodica [6][14][3] = "M";
        tabelaPeriodica [6][14][4] = "Chumbo";
        tabelaPeriodica [6][14][5] = "207.00";
        tabelaPeriodica [6][15][0] = "Bi";
        tabelaPeriodica [6][15][1] = "83";
        tabelaPeriodica [6][15][2] = "S";
        tabelaPeriodica [6][15][3] = "M";
        tabelaPeriodica [6][15][4] = "Bismuto";
        tabelaPeriodica [6][15][5] = "209.00";
        tabelaPeriodica [6][16][0] = "Po";
        tabelaPeriodica [6][16][1] = "84";
        tabelaPeriodica [6][16][2] = "S";
        tabelaPeriodica [6][16][3] = "S";
        tabelaPeriodica [6][16][4] = "Polônio";
        tabelaPeriodica [6][16][5] = "209.00";
        tabelaPeriodica [6][17][0] = "At";
        tabelaPeriodica [6][17][1] = "85";
        tabelaPeriodica [6][17][2] = "S";
        tabelaPeriodica [6][17][3] = "A";
        tabelaPeriodica [6][17][4] = "Astato";
        tabelaPeriodica [6][17][5] = "210.00";
        tabelaPeriodica [6][18][0] = "Rn";
        tabelaPeriodica [6][18][1] = "86";
        tabelaPeriodica [6][18][2] = "G";
        tabelaPeriodica [6][18][3] = "G";
        tabelaPeriodica [6][18][4] = "Randônio";
        tabelaPeriodica [6][18][5] = "222.00";
        tabelaPeriodica [7][1][0] = "Fr";
        tabelaPeriodica [7][1][1] = "87";
        tabelaPeriodica [7][1][2] = "S";
        tabelaPeriodica [7][1][3] = "M";
        tabelaPeriodica [7][1][4] = "Frâncio";
        tabelaPeriodica [7][1][5] = "223.00";
        tabelaPeriodica [7][2][0] = "Ra";
        tabelaPeriodica [7][2][1] = "88";
        tabelaPeriodica [7][2][2] = "S";
        tabelaPeriodica [7][2][3] = "M";
        tabelaPeriodica [7][2][4] = "Rádio";
        tabelaPeriodica [7][2][5] = "226.00";
        tabelaPeriodica [7][3][0] = "Ac";
        tabelaPeriodica [7][3][1] = "89";
        tabelaPeriodica [7][3][2] = "S";
        tabelaPeriodica [7][3][3] = "M";
        tabelaPeriodica [7][3][4] = "Actínio";
        tabelaPeriodica [7][3][5] = "227.00";
        tabelaPeriodica [7][4][0] = "Rf";
        tabelaPeriodica [7][4][1] = "104";
        tabelaPeriodica [7][4][2] = "S";
        tabelaPeriodica [7][4][3] = "M";
        tabelaPeriodica [7][4][4] = "Rutherfórdio";
        tabelaPeriodica [7][4][5] = "261";
        tabelaPeriodica [7][5][0] = "Db";
        tabelaPeriodica [7][5][1] = "105";
        tabelaPeriodica [7][5][2] = "S";
        tabelaPeriodica [7][5][3] = "M";
        tabelaPeriodica [7][5][4] = "Dúbnio";
        tabelaPeriodica [7][5][5] = "262.00";
        tabelaPeriodica [7][6][0] = "Sg";
        tabelaPeriodica [7][6][1] = "106";
        tabelaPeriodica [7][6][2] = "S";
        tabelaPeriodica [7][6][3] = "M";
        tabelaPeriodica [7][6][4] = "Seabórguio";
        tabelaPeriodica [7][6][5] = "266.00";
        tabelaPeriodica [7][7][0] = "Bh";
        tabelaPeriodica [7][7][1] = "107";
        tabelaPeriodica [7][7][2] = "S";
        tabelaPeriodica [7][7][3] = "M";
        tabelaPeriodica [7][7][4] = "Bóhrio";
        tabelaPeriodica [7][7][5] = "264.00";
        tabelaPeriodica [7][8][0] = "Hs";
        tabelaPeriodica [7][8][1] = "108";
        tabelaPeriodica [7][8][2] = "S";
        tabelaPeriodica [7][8][3] = "M";
        tabelaPeriodica [7][8][4] = "Hássio";
        tabelaPeriodica [7][8][5] = "269.00";
        tabelaPeriodica [7][9][0] = "Mt";
        tabelaPeriodica [7][9][1] = "109";
        tabelaPeriodica [7][9][2] = "S";
        tabelaPeriodica [7][9][3] = "M";
        tabelaPeriodica [7][9][4] = "Meitnério";
        tabelaPeriodica [7][9][5] = "268.00";
        tabelaPeriodica [7][10][0] = "Ds";
        tabelaPeriodica [7][10][1] = "110";
        tabelaPeriodica [7][10][2] = "S";
        tabelaPeriodica [7][10][3] = "M";
        tabelaPeriodica [7][10][4] = "Darmastádio";
        tabelaPeriodica [7][10][5] = "269.00";
        tabelaPeriodica [7][11][0] = "Rg";
        tabelaPeriodica [7][11][1] = "111";
        tabelaPeriodica [7][11][2] = "S";
        tabelaPeriodica [7][11][3] = "M";
        tabelaPeriodica [7][11][4] = "Roentgênio";
        tabelaPeriodica [7][11][5] = "272.00";
        tabelaPeriodica [7][12][0] = "Uub";
        tabelaPeriodica [7][12][1] = "112";
        tabelaPeriodica [7][12][2] = "S";
        tabelaPeriodica [7][12][3] = "M";
        tabelaPeriodica [7][12][4] = "Ununóbio";
        tabelaPeriodica [7][12][5] = "112.00";
        tabelaPeriodica [7][13][0] = "Uut";
        tabelaPeriodica [7][13][1] = "113";
        tabelaPeriodica [7][13][2] = "X";
        tabelaPeriodica [7][13][3] = "X";
        tabelaPeriodica [7][13][4] = "Ununótrio";
        tabelaPeriodica [7][13][5] = null;
        tabelaPeriodica [7][14][0] = "Uuq";
        tabelaPeriodica [7][14][1] = "114";
        tabelaPeriodica [7][14][2] = "S";
        tabelaPeriodica [7][14][3] = "M";
        tabelaPeriodica [7][14][4] = "Ununquádio";
        tabelaPeriodica [7][14][5] = "285.00";
        tabelaPeriodica [7][15][0] = "Uup";
        tabelaPeriodica [7][15][1] = "115";
        tabelaPeriodica [7][15][2] = "X";
        tabelaPeriodica [7][15][3] = "X";
        tabelaPeriodica [7][15][4] = "Unumpêntio";
        tabelaPeriodica [7][15][5] = null;
        tabelaPeriodica [7][16][0] = "Uuh";
        tabelaPeriodica [7][16][1] = "116";
        tabelaPeriodica [7][16][2] = "S";
        tabelaPeriodica [7][16][3] = "S";
        tabelaPeriodica [7][16][4] = "Ununhéxio";
        tabelaPeriodica [7][16][5] = "289.00";
        tabelaPeriodica [7][17][0] = "Uus";
        tabelaPeriodica [7][17][1] = "117";
        tabelaPeriodica [7][17][2] = "X";
        tabelaPeriodica [7][17][3] = "X";
        tabelaPeriodica [7][17][4] = "Ununséptio";
        tabelaPeriodica [7][17][5] = null;
        tabelaPeriodica [7][18][0] = "Uuo";
        tabelaPeriodica [7][18][1] = "118";
        tabelaPeriodica [7][18][2] = "G";
        tabelaPeriodica [7][18][3] = "X";
        tabelaPeriodica [7][18][4] = "Ununóctio";
        tabelaPeriodica [7][18][5] = "293.00";

        valor = "!!!---Start---------------------------------------!!!\n";

        for(linha = 1; linha < 9; linha++) {
            for(coluna = 1; coluna < 19; coluna++) {
                if (!((tabelaPeriodica[linha][coluna][3]) == null)) {
                    valor = valor + "[" + linha + "][" + coluna + "];" + tabelaPeriodica [linha][coluna][0] + ";" + tabelaPeriodica [linha][coluna][1] + ";" + tabelaPeriodica [linha][coluna][2] + ";" + tabelaPeriodica [linha][coluna][3] + ";" + tabelaPeriodica [linha][coluna][4] + ";" + tabelaPeriodica [linha][coluna][5] + "\n";
                }
            }
        }

        valor = valor + "!!!---End-----------------------------------------!!!\n";

        return (valor);

    }

    public String queueEDelivery () {
        int linha;
        String valor = "";

        vetorPauling [1][0] = "1s";
        vetorPauling [1][1] = "2";
        vetorPauling [1][2] = null;
        vetorPauling [2][0] = "2s";
        vetorPauling [2][1] = "2";
        vetorPauling [2][2] = null;
        vetorPauling [3][0] = "2p";
        vetorPauling [3][1] = "6";
        vetorPauling [3][2] = null;
        vetorPauling [4][0] = "3s";
        vetorPauling [4][1] = "2";
        vetorPauling [4][2] = null;
        vetorPauling [5][0] = "3p";
        vetorPauling [5][1] = "6";
        vetorPauling [5][2] = null;
        vetorPauling [6][0] = "4s";
        vetorPauling [6][1] = "2";
        vetorPauling [6][2] = null;
        vetorPauling [7][0] = "3d";
        vetorPauling [7][1] = "10";
        vetorPauling [7][2] = null;
        vetorPauling [8][0] = "4p";
        vetorPauling [8][1] = "6";
        vetorPauling [8][2] = null;
        vetorPauling [9][0] = "5s";
        vetorPauling [9][1] = "2";
        vetorPauling [9][2] = null;
        vetorPauling [10][0] = "4d";
        vetorPauling [10][1] = "10";
        vetorPauling [10][2] = null;
        vetorPauling [11][0] = "5p";
        vetorPauling [11][1] = "6";
        vetorPauling [11][2] = null;
        vetorPauling [12][0] = "6s";
        vetorPauling [12][1] = "2";
        vetorPauling [12][2] = null;
        vetorPauling [13][0] = "4f";
        vetorPauling [13][1] = "14";
        vetorPauling [13][2] = null;
        vetorPauling [14][0] = "5d";
        vetorPauling [14][1] = "10";
        vetorPauling [14][2] = null;
        vetorPauling [15][0] = "6p";
        vetorPauling [15][1] = "6";
        vetorPauling [15][2] = null;
        vetorPauling [16][0] = "7s";
        vetorPauling [16][1] = "2";
        vetorPauling [16][2] = null;
        vetorPauling [17][0] = "5f";
        vetorPauling [17][1] = "14";
        vetorPauling [17][2] = null;
        vetorPauling [18][0] = "6d";
        vetorPauling [18][1] = "10";
        vetorPauling [18][2] = null;
        vetorPauling [19][0] = "7p";
        vetorPauling [19][1] = "6";
        vetorPauling [19][2] = null;

        /*
        valor = "!!!---Start---------------------------------------!!!\n";

        for(linha = 1; linha < 20; linha++) {
            valor = valor + "e- [" + linha + "] = " + vetorPauling [linha][0] + " | Level -e = " + vetorPauling [linha][1] + "\n";
        }

        valor = valor + "!!!---End-----------------------------------------!!!\n";
        */

        return (valor);

    }

    public String queueEDeliverySort () {
        int linha;
        String valor = "";

        vetorPaulingSort [1][0] = "1s";
        vetorPaulingSort [1][1] = "2";
        vetorPaulingSort [1][2] = null;
        vetorPaulingSort [1][3] = "K";
        vetorPaulingSort [2][0] = "2s";
        vetorPaulingSort [2][1] = "2";
        vetorPaulingSort [2][2] = null;
        vetorPaulingSort [2][3] = "L";
        vetorPaulingSort [3][0] = "2p";
        vetorPaulingSort [3][1] = "6";
        vetorPaulingSort [3][2] = null;
        vetorPaulingSort [3][3] = "L";
        vetorPaulingSort [4][0] = "3s";
        vetorPaulingSort [4][1] = "2";
        vetorPaulingSort [4][2] = null;
        vetorPaulingSort [4][3] = "M";
        vetorPaulingSort [5][0] = "3p";
        vetorPaulingSort [5][1] = "6";
        vetorPaulingSort [5][2] = null;
        vetorPaulingSort [5][3] = "M";
        vetorPaulingSort [6][0] = "3d";
        vetorPaulingSort [6][1] = "10";
        vetorPaulingSort [6][2] = null;
        vetorPaulingSort [6][3] = "M";
        vetorPaulingSort [7][0] = "4s";
        vetorPaulingSort [7][1] = "2";
        vetorPaulingSort [7][2] = null;
        vetorPaulingSort [7][3] = "N";
        vetorPaulingSort [8][0] = "4p";
        vetorPaulingSort [8][1] = "6";
        vetorPaulingSort [8][2] = null;
        vetorPaulingSort [8][3] = "N";
        vetorPaulingSort [9][0] = "4d";
        vetorPaulingSort [9][1] = "10";
        vetorPaulingSort [9][2] = null;
        vetorPaulingSort [9][3] = "N";
        vetorPaulingSort [10][0] = "4f";
        vetorPaulingSort [10][1] = "14";
        vetorPaulingSort [10][2] = null;
        vetorPaulingSort [10][3] = "N";
        vetorPaulingSort [11][0] = "5s";
        vetorPaulingSort [11][1] = "2";
        vetorPaulingSort [11][2] = null;
        vetorPaulingSort [11][3] = "O";
        vetorPaulingSort [12][0] = "5p";
        vetorPaulingSort [12][1] = "6";
        vetorPaulingSort [12][2] = null;
        vetorPaulingSort [12][3] = "O";
        vetorPaulingSort [13][0] = "5d";
        vetorPaulingSort [13][1] = "10";
        vetorPaulingSort [13][2] = null;
        vetorPaulingSort [13][3] = "O";
        vetorPaulingSort [14][0] = "5f";
        vetorPaulingSort [14][1] = "14";
        vetorPaulingSort [14][2] = null;
        vetorPaulingSort [14][3] = "O";
        vetorPaulingSort [15][0] = "6s";
        vetorPaulingSort [15][1] = "2";
        vetorPaulingSort [15][2] = null;
        vetorPaulingSort [15][3] = "P";
        vetorPaulingSort [16][0] = "6p";
        vetorPaulingSort [16][1] = "6";
        vetorPaulingSort [16][2] = null;
        vetorPaulingSort [16][3] = "P";
        vetorPaulingSort [17][0] = "6d";
        vetorPaulingSort [17][1] = "10";
        vetorPaulingSort [17][2] = null;
        vetorPaulingSort [17][3] = "P";
        vetorPaulingSort [18][0] = "7s";
        vetorPaulingSort [18][1] = "2";
        vetorPaulingSort [18][2] = null;
        vetorPaulingSort [18][3] = "Q";
        vetorPaulingSort [19][0] = "7p";
        vetorPaulingSort [19][1] = "6";
        vetorPaulingSort [19][2] = null;
        vetorPaulingSort [19][3] = "Q";

        /*
        valor = "!!!---Start---------------------------------------!!!\n";

        for(linha = 1; linha < 20; linha++) {
            valor = valor + "Sorting e- [" + linha + "] = " + vetorPaulingSort [linha][0] + " | Level -e = " + vetorPaulingSort [linha][1] + "\n";
        }

        valor = valor + "!!!---End-----------------------------------------!!!\n";
        */

        return (valor);

    }

    public String loadLevelMax() {
        int linha;
        String valor = null;
        tableLevelMax [1][0] = "K";
        tableLevelMax [1][1] = "2";
        tableLevelMax [2][0] = "L";
        tableLevelMax [2][1] = "8";
        tableLevelMax [3][0] = "M";
        tableLevelMax [3][1] = "18";
        tableLevelMax [4][0] = "N";
        tableLevelMax [4][1] = "32";
        tableLevelMax [5][0] = "O";
        tableLevelMax [5][1] = "32";
        tableLevelMax [6][0] = "P";
        tableLevelMax [6][1] = "18";
        tableLevelMax [7][0] = "Q";
        tableLevelMax [7][1] = "8";

        valor = "!!!---Start---------------------------------------!!!\n";

        for(linha = 1; linha < 8; linha++) {
            valor = valor + "[" + linha + "];" + tableLevelMax [linha][0] + ";" + tableLevelMax [linha][1] + "\n";
        }

        valor = valor + "!!!---End-----------------------------------------!!!\n";

        return (valor);

    }

    public String loadLevel() {
        int linha;
        String valor = "";

        tabelaSubniveis [1][0] = "1";
        tabelaSubniveis [2][0] = "2";
        tabelaSubniveis [3][0] = "3";
        tabelaSubniveis [4][0] = "4";
        tabelaSubniveis [5][0] = "5";
        tabelaSubniveis [6][0] = "6";
        tabelaSubniveis [7][0] = "7";
        tabelaSubniveis [8][0] = "8";
        tabelaSubniveis [9][0] = "9";
        tabelaSubniveis [10][0] = "10";
        tabelaSubniveis [11][0] = "11";
        tabelaSubniveis [12][0] = "12";
        tabelaSubniveis [13][0] = "13";
        tabelaSubniveis [14][0] = "14";

        /*
        valor = "!!!---Start---------------------------------------!!!\n";

        for(linha = 1; linha < 15; linha++) {
             valor = valor + "Level e- [" + linha + "] = " + tabelaSubniveis [linha][0] + "\n";
        }

        valor = valor + "!!!---End-----------------------------------------!!!\n";
        */

        return (valor);

    }

    public String viewE (String keyE) {
        int linha, coluna, Z, linhaE, colunaE;
        String valor = "";

        //valor = "!!!---Start---------------------------------------!!!\n";
        linhaE = 0;
        colunaE = 0;

        for (linha = 1; linha < 8; linha++) {
            for (coluna = 1; coluna < 19; coluna++) {
                if ((tabelaPeriodica [linha][coluna][0] == keyE)) {
                    //valor = valor + "P&F [" + linha + "][" + coluna + "] = " + tabelaPeriodica [linha][coluna][0] + " - Z = " + tabelaPeriodica [linha][coluna][1] + " - S = " + tabelaPeriodica [linha][coluna][2] + " - T = " + tabelaPeriodica [linha][coluna][3] + "\n";
                    linhaE = linha;
                    colunaE = coluna;
                }
            }
        }

        Z = Integer.parseInt(tabelaPeriodica [linhaE][colunaE][1]);

        for(linha = 1; linha < 20; linha++) {
            Z = Z - (Integer.parseInt(vetorPauling [linha][1]));
            if(Z < 0) {
                vetorPauling [linha][2] = tabelaSubniveis [(Z + Integer.parseInt(vetorPauling [linha][1]))][0];
                //valor = valor + "[" + vetorPauling [linha][0] + "]" + vetorPauling [linha][2] + " ";
                break;
            } else {
                vetorPauling [linha][2] = tabelaSubniveis [Integer.parseInt(vetorPauling [linha][1])][0];
                //valor = valor + "[" + vetorPauling [linha][0] + "]" + vetorPauling [linha][2] + " ";
            }
        }

        //valor = valor + "\n!!!---End-----------------------------------------!!!\n";

        return (valor);

    }

    public String viewESort (String keyE) {
        int linha, coluna, linhaS, linhaE, colunaE;
        String valor = "";

        //valor = "!!!---Start---------------------------------------!!!\n";

        for (linha = 1; linha < 8; linha++) {
            for (coluna = 1; coluna < 19; coluna++) {
                if ((tabelaPeriodica [linha][coluna][0] == keyE)) {
                    //valor = valor + "P&F [" + linha + "][" + coluna + "] = " + tabelaPeriodica [linha][coluna][0] + " - Z = " + tabelaPeriodica [linha][coluna][1] + " - S = " + tabelaPeriodica [linha][coluna][2] + " - T = " + tabelaPeriodica [linha][coluna][3] + "\n";
                    linhaE = linha;
                    colunaE = coluna;
                }
            }
        }

        for(linha = 1; linha < 20; linha++) {
            for(linhaS = 1; linhaS < 20; linhaS++) {
                if(vetorPauling [linha][0] == vetorPaulingSort [linhaS][0]) {
                    vetorPaulingSort [linhaS][2] = vetorPauling [linha][2];
                }
            }
        }

        /*
        for(linha = 1; linha < 20; linha++) {
            if(vetorPaulingSort [linha][2] != null) {
                valor = valor + "[" +  vetorPaulingSort [linha][0] + "]" +  vetorPaulingSort [linha][2] + " ";
            }
        }

        valor = valor + "\n!!!---End-----------------------------------------!!!\n";
        */

        return (valor);

    }

    public String viewChanceIM (String keyE) {
        int linha, coluna, quantidade;
        int giro = 0;
        String valor = "";
        Boolean estado = false;

        /*
        valor = "!!!---Start---------------------------------------!!!\n";

        for (linha = 1; linha < 8; linha++) {
            for (coluna = 1; coluna < 19; coluna++) {
                if ((tabelaPeriodica [linha][coluna][0] == keyE)) {
                    valor = valor + "E = P&F [" + linha + "][" + coluna + "] = " + tabelaPeriodica [linha][coluna][0] + " - Z = " + tabelaPeriodica [linha][coluna][1] + " - S = " + tabelaPeriodica [linha][coluna][2] + " - T = " + tabelaPeriodica [linha][coluna][3] + "\n";
                }
            }
        }

        valor = valor + "!!!---End-----------------------------------------!!!\n";
        */

        quantidade = 1;
        do {
            giro = 0;
            estavel = 0;
            for (linha = 1; linha < 8; linha++) {
                for (coluna = 1; coluna < 19; coluna++) {
                    if (!(tabelaPeriodica[linha][coluna][0] == null)) {
                        if ((tabelaPeriodica[linha][coluna][3] == "A") || (tabelaPeriodica[linha][coluna][3] == "H") || (tabelaPeriodica[linha][coluna][3] == "S")) {
                            //valor = valor + "P&F [" + linha + "][" + coluna + "] = " + tabelaPeriodica [linha][coluna][0] + " - Z = " + tabelaPeriodica [linha][coluna][1] + " - S =  " + tabelaPeriodica [linha][coluna][2] + " - T = " + tabelaPeriodica [linha][coluna][3] + "\n";
                            valor = valor + queueEDelivery().toString();
                            valor = valor + queueEDeliverySort().toString();
                            valor = valor + viewE(tabelaPeriodica[linha][coluna][0]);
                            valor = valor + viewESort(tabelaPeriodica[linha][coluna][0]);
                            valor = valor + layerEnergy(tabelaPeriodica[linha][coluna][0], quantidade);
                            giro++;
                        }
                    }
                }
            }
            quantidade++;
            if ((estavel)== giro) {
                estado = true;
            } else {
                estado = false;
            }
        } while (estado == false);

        return(valor);

    }

    public String viewChanceIHSA (String keyE) {
        int linha, coluna, quantidade;
        int giro = 0;
        String valor = "";
        Boolean estado = false;

        /*
        valor = "!!!---Start---------------------------------------!!!\n";

        for (linha = 1; linha < 8; linha++) {
            for (coluna = 1; coluna < 19; coluna++) {
                if ((tabelaPeriodica [linha][coluna][0] == keyE)) {
                    valor = valor + "E = P&F [" + linha + "][" + coluna + "] = " + tabelaPeriodica [linha][coluna][0] + " - Z = " + tabelaPeriodica [linha][coluna][1] + " - S = " + tabelaPeriodica [linha][coluna][2] + " - T = " + tabelaPeriodica [linha][coluna][3] + "\n";
                }
            }
        }

        valor = valor + "!!!---End-----------------------------------------!!!\n";
        */

        quantidade = 1;
        do {
            giro = 0;
            estavel = 0;
            for (linha = 1; linha < 8; linha++) {
                for (coluna = 1; coluna < 19; coluna++) {
                    if (!(tabelaPeriodica[linha][coluna][0] == null)) {
                        if (tabelaPeriodica[linha][coluna][3] == "M") {
                            //valor = valor + "P&F [" + linha + "][" + coluna + "] = " + tabelaPeriodica [linha][coluna][0] + " - Z = " + tabelaPeriodica [linha][coluna][1] + " - S =  " + tabelaPeriodica [linha][coluna][2] + " - T = " + tabelaPeriodica [linha][coluna][3] + "\n";
                            valor = valor + queueEDelivery().toString();
                            valor = valor + queueEDeliverySort().toString();
                            valor = valor + viewE(tabelaPeriodica[linha][coluna][0]);
                            valor = valor + viewESort(tabelaPeriodica[linha][coluna][0]);
                            valor = valor + layerEnergy(tabelaPeriodica[linha][coluna][0], quantidade);
                            giro++;
                        }
                    }
                }
            }
            quantidade++;
            if ((estavel)== giro) {
                estado = true;
            } else {
                estado = false;
            }
        } while (estado == false);

        return(valor);

    }


    public String layerEnergy (String keyE, int quantidade) {
        int linha, coluna, valencia;
        String elementA, elementB = null;
        String valor = "";
        Double percentKey, percentTwo;

        //String tabela [][][] = new String [10][20][4];

        //tabela = tabelaPeriodica;

        //valor = "!!!---Start---------------------------------------!!!\n";

        if (!(vetorElementoKey [1] == null)) {
            //valor = valor + "[" + vetorElementoKey [2] + "]" + vetorElementoKey [1] + ";" + vetorElementoKey [3] + ";" + vetorElementoKey [6] + ";" + vetorElementoKey [7] + ";";
            valor = valor + "";
        }

        for (linha = 1; linha < 8; linha++) {
            for (coluna = 1; coluna < 19; coluna++) {
                if ((tabelaPeriodica [linha][coluna][0] == keyE)) {
                    valor = valor + "[" + tabelaPeriodica [linha][coluna][1] + "]" + tabelaPeriodica [linha][coluna][0]; // + ";" + tabelaPeriodica [linha][coluna][3];
                    vetorElemento [1] = tabelaPeriodica [linha][coluna][0];
                    vetorElemento [2] = tabelaPeriodica [linha][coluna][1];
                    vetorElemento [3] = tabelaPeriodica [linha][coluna][3];
                }
            }
        }

        elementA = vetorPaulingSort [1][3].toString();
        elementB = vetorPaulingSort [1][3].toString();

        for (linha = 1; linha < 20; linha++) {
            if (!(vetorPaulingSort [linha][2] == null)) {
                elementB = vetorPaulingSort[linha][3].toString();
                //valor = valor + "[" + linha + "][3] = " + vetorPaulingSort [linha][3] + " - A = " + elementA + " - B = " + elementB + " \n";
                if ((elementB.compareTo(elementA) > 0)) {
                    elementA = elementB;
                    //valor = valor + "Element = " + elementA + "\n";
                } // else {
                //  valor = valor + "Element = " + elementA + "\n";
                //}
            }
        }

        vetorElemento [4] = elementA;

        valencia = 0;

        for (linha = 1; linha < 20; linha++) {
            if (vetorPaulingSort[linha][3] == elementA) {
                if (vetorPaulingSort[linha][2] != null) {
                    valencia = valencia + Integer.parseInt(vetorPaulingSort[linha][2]);
                }
            }
        }

        //valor = valor + "Elemento = " + vetorElemento [4] + "\n";

        vetorElemento [6] = "" + valencia;

        //valor = valor + ";" + valencia + "";

        for (linha = 1; linha < 8; linha++) {
            if (tableLevelMax[linha][0] == elementA) {
                //valor = valor + ";" + tableLevelMax[linha][1];
                vetorElemento [7] = "" + tableLevelMax[linha][1];
            }
        }

        percentKey = 0.0;
        percentTwo = 0.0;

        if (!(vetorElementoKey [1] == null)) {
            percentKey = Double.parseDouble (vetorElementoKey [6]) * 100 / Double.parseDouble (vetorElementoKey [7]);
            percentKey = Double.valueOf(Math.round(percentKey));
            percentTwo = Double.parseDouble (vetorElemento [6]) * 100 / Double.parseDouble (vetorElemento [7]);
            percentTwo = Double.valueOf(Math.round(percentTwo));
        }

        //valor = valor + ";" + percentKey.toString() + ";" + percentTwo.toString();

        if (!(vetorElementoKey [1] == null)) {
            if (percentKey > percentTwo) {
                //valor = valor + changeTwoToKey(quantidade);
                //valor = valor + ";Change two to key";
                valor = valor + ";;;;;";
                valor = valor + ";;;;;";
                estavel = estavel + 1;
            } else {
                valor = valor + changeKeyToTwo(quantidade);
            }
        }

        valor = valor + "\n";

        //valor = valor + "!!!---End-----------------------------------------!!!\n";

        return (valor);

    }

    public String changeKeyToTwo (int quantidade) {
        int linha;
        String valor = "";

        String [] eKey = new String [8];
        String [] eTwo = new String [8];
        int valencia = 0;
        int maximo = 0;

        //valencia = Integer.parseInt(vetorElementoKey [6]);
        maximo = (Integer.parseInt(vetorElemento [7]) - Integer.parseInt(vetorElemento [6])) * quantidade;

        //valor = valor + ";" + valencia + ";" + maximo;

        for (linha  = 1; linha < (Integer.parseInt(vetorElementoKey [6]) + 1); linha++) {
            if (linha <= maximo) {
                valencia = valencia + 1;
            }
        }
        eKey [1] = "1";
        eKey [3] = vetorElementoKey [1].toString();
        eKey [2] = "" + (Integer.parseInt(vetorElementoKey [2]) - valencia);
        eKey [4] = "+" + valencia;
        eKey [5] = "1";
        eKey [6] = "" + (Integer.parseInt(vetorElementoKey [6]) - valencia);
        eKey [7] = vetorElementoKey [7];

        eTwo [1] = "1";
        eTwo [3] = vetorElemento [1].toString();
        eTwo [2] = "" + (Integer.parseInt(vetorElemento [2]) + (valencia / quantidade));
        eTwo [4] = "-" + (valencia / quantidade);
        eTwo [5] = "" + quantidade;
        eTwo [6] = "" + (Integer.parseInt(vetorElemento [6]) + (valencia / quantidade));
        eTwo [7] = vetorElemento [7];

        valor = valor + ";" + eKey[1] + ";[" + eKey[2] + "];" + eKey[3] + ";[" + eKey[4] + "];" + eKey[5];
        valor = valor + ";" + eTwo[1] + ";[" + eTwo[2] + "];" + eTwo[3] + ";[" + eTwo[4] + "];" + eTwo[5];

        if (Integer.parseInt(eKey [6]) == 0) {
            estavel = estavel + 1;
        } else {
            estavel = estavel + 0;
        }

        return (valor);
    }

    public String changeTwoToKey (int quantidade) {
        int linha;
        String valor = "";

        String [] eKey = new String [8];
        String [] eTwo = new String [8];
        int valencia = 0;
        int maximo = 0;

        //valencia = Integer.parseInt(vetorElementoKey [6]);
        maximo = (Integer.parseInt(vetorElementoKey [7]) - Integer.parseInt(vetorElementoKey [6])) * quantidade;

        //valor = valor + ";" + valencia + ";" + maximo;

        for (linha  = 1; linha < (Integer.parseInt(vetorElemento [6]) + 1); linha++) {
            if (linha <= maximo) {
                valencia = valencia + 1;
            }
        }

        eKey [1] = "1";
        eKey [3] = vetorElementoKey [1].toString();
        eKey [2] = "" + (Integer.parseInt(vetorElementoKey [2]) + (valencia / quantidade));
        eKey [4] = "-" + (valencia / quantidade);
        eKey [5] = "" + quantidade;
        eKey [6] = "" + (Integer.parseInt(vetorElementoKey [6]) + (valencia / quantidade));
        eKey [7] = vetorElementoKey [7];

        eTwo [1] = "1";
        eTwo [3] = vetorElemento [1].toString();
        eTwo [2] = "" + (Integer.parseInt(vetorElemento [2]) - valencia);
        eTwo [4] = "+" + (valencia / quantidade);
        eTwo [5] = "1";
        eTwo [6] = "" + (Integer.parseInt(vetorElemento [6]) - valencia);
        eTwo [7] = vetorElemento [7];

        valor = valor + ";" + eKey[1] + ";[" + eKey[2] + "];" + eKey[3] + ";[" + eKey[4] + "];" + eKey[5];
        valor = valor + ";" + eTwo[1] + ";[" + eTwo[2] + "];" + eTwo[3] + ";[" + eTwo[4] + "];" + eTwo[5];

        if (Integer.parseInt(eKey [6]) == 0) {
            estavel = estavel + 1;
        } else {
            estavel = estavel + 0;
        }

        return (valor);
    }

    public String linkMolecular (String keyE, int quantidade) {
        int linha, coluna, valencia;
        String valor = "";
        String elementA, elementB = null;

        for (linha = 1; linha < 8; linha++) {
            for (coluna = 1; coluna < 19; coluna++) {
                if ((tabelaPeriodica [linha][coluna][0] == keyE)) {
                    vetorElemento [1] = "1";
                    vetorElemento [2] = tabelaPeriodica [linha][coluna][1];
                    vetorElemento [3] = tabelaPeriodica [linha][coluna][0];
                }
            }
        }

        elementA = vetorPaulingSort [1][3].toString();

        for (linha = 1; linha < 20; linha++) {
            if (!(vetorPaulingSort [linha][2] == null)) {
                elementB = vetorPaulingSort[linha][3].toString();
                if ((elementB.compareTo(elementA) > 0)) {
                    elementA = elementB;
                }
            }
        }

        valencia = 0;

        for (linha = 1; linha < 20; linha++) {
            if (vetorPaulingSort[linha][3] == elementA) {
                if (vetorPaulingSort[linha][2] != null) {
                    valencia = valencia + Integer.parseInt(vetorPaulingSort[linha][2]);
                }
            }
        }

        vetorElemento [4] = "";
        vetorElemento [5] = "" + quantidade;
        vetorElemento [6] = "" + valencia;

        for (linha = 1; linha < 8; linha++) {
            if (tableLevelMax[linha][0] == elementA) {
                if (valencia == 3) {
                    vetorElemento [7] = "6";
                } else {
                    if ((tableLevelMax[linha][1] == "18") || (tableLevelMax[linha][1] == "32")) {
                        vetorElemento [7] = "8";
                    } else {
                        vetorElemento [7] = "" + tableLevelMax[linha][1];
                    }
                }
            }
        }

        if (!(vetorElementoKey [1] == null)) {
            valor = valor + vetorElementoKey [1] + ";[" + vetorElementoKey [2] + "];" + vetorElementoKey [3] + ";[" + vetorElementoKey [4] + "];" + vetorElementoKey [5] + ";" + vetorElementoKey [6] + ";" + vetorElementoKey [7] + ";";
        } else {
            valor = valor + "";
        }

        valor = valor + vetorElemento [1] + ";[" + vetorElemento [2] + "];" + vetorElemento [3] + ";[" + vetorElemento [4] + "];" + vetorElemento [5] + ";" + vetorElemento [6] + ";" + vetorElemento [7];

        if (vetorElementoKey [1] == null) {
            valor = valor + "\n";
        }

        return (valor);
    }


    public String shareMolecule () {

        return ("");
    }

    public String viewShareHSA () {
        int linha, coluna, quantidade;
        int giro = 0;
        String valor = "";
        Boolean estado = false;

        quantidade = 1;
        do {
            giro = 0;
            estavel = 0;
            for (linha = 1; linha < 8; linha++) {
                for (coluna = 1; coluna < 19; coluna++) {
                    if (!(tabelaPeriodica[linha][coluna][0] == null)) {
                        if ((tabelaPeriodica[linha][coluna][3] == "A") || (tabelaPeriodica[linha][coluna][3] == "H") || (tabelaPeriodica[linha][coluna][3] == "S")) {
                            //valor = valor + "P&F [" + linha + "][" + coluna + "] = " + tabelaPeriodica [linha][coluna][0] + " - Z = " + tabelaPeriodica [linha][coluna][1] + " - S =  " + tabelaPeriodica [linha][coluna][2] + " - T = " + tabelaPeriodica [linha][coluna][3] + "\n";
                            valor = valor + queueEDelivery().toString();
                            valor = valor + queueEDeliverySort().toString();
                            valor = valor + viewE(tabelaPeriodica[linha][coluna][0]);
                            valor = valor + viewESort(tabelaPeriodica[linha][coluna][0]);
                            valor = valor + linkMolecular(tabelaPeriodica[linha][coluna][0], quantidade);

                            valor = valor + loadLink (quantidade);

                            giro++;
                        }
                    }
                }
            }
            quantidade++;
            if ((estavel)== giro) {
                estado = true;
            } else {
                estado = false;
            }
            estado = true;
        } while (estado == false);

        return(valor);

    }

    public String loadLink (int quantidade) {
        int linha, eA, eB, eMA, eMB, eXA, eXB;
        Boolean aEstavel, bEstavel = false;
        String valor = "";

        eA = Integer.parseInt(vetorElementoKey[2]);
        eMA = Integer.parseInt(vetorElementoKey[7]);
        eXA = 1;
        eB = Integer.parseInt(vetorElemento[6]);
        eMB = Integer.parseInt(vetorElemento[7]);
        if (eA <= eB) {
            for (linha = 1; linha <= eB; linha++) {
                if (eA >= eMA) {
                    aEstavel = true;
                    if (eB >= eMB){
                        bEstavel = true;
                    } else {
                        eXA++;
                        eB++;
                    }
                } else {
                    eA++;
                    eB++;
                }
            }
        }

        valor = valor + ";" + eA + ";" + eXA + ";" + eB + ";" + "1\n";

        return (valor);
    }

    private MutableLiveData<String> mText;

    public DashboardViewModel() {
        mText = new MutableLiveData<>();

        String lista = null;
        String keyE;
        int quantidade;
        lista = loadPeriodicTable().toString();
        lista = lista + loadLevel();
        lista = lista + loadLevelMax();
// Inicio ---- Primeiro

        lista = lista + "!!!---Start---------------------------------------!!!\n";
        keyE = "Al";
        quantidade = 1;
        lista = lista + queueEDelivery().toString();
        lista = lista + queueEDeliverySort().toString();
        lista = lista + viewE(keyE);
        lista = lista + viewESort(keyE);
        lista = lista + layerEnergy(keyE, quantidade);
        lista = lista + "!!!---End-----------------------------------------!!!\n";

        vetorElementoKey [1] = vetorElemento [1];
        vetorElementoKey [2] = vetorElemento [2];
        vetorElementoKey [3] = vetorElemento [3];
        vetorElementoKey [4] = vetorElemento [4];
        vetorElementoKey [5] = vetorElemento [5];
        vetorElementoKey [6] = vetorElemento [6];
        vetorElementoKey [7] = vetorElemento [7];

        lista = lista + "!!!---Start---------------------------------------!!!\n";
        lista = lista + viewChanceIM (keyE);
        lista = lista + "!!!---End-----------------------------------------!!!\n";

// Fim ---- Primeiro
// Inicio ---- Segundo

        lista = lista + "!!!---Start---------------------------------------!!!\n";
        keyE = "Ge";
        quantidade = 1;
        vetorElementoKey [1] = null;
        vetorElementoKey [2] = null;
        vetorElementoKey [3] = null;
        vetorElementoKey [4] = null;
        vetorElementoKey [5] = null;
        vetorElementoKey [6] = null;
        vetorElementoKey [7] = null;
        lista = lista + queueEDelivery().toString();
        lista = lista + queueEDeliverySort().toString();
        lista = lista + viewE(keyE);
        lista = lista + viewESort(keyE);
        lista = lista + layerEnergy(keyE, quantidade);
        lista = lista + "!!!---End-----------------------------------------!!!\n";

        vetorElementoKey [1] = vetorElemento [1];
        vetorElementoKey [2] = vetorElemento [2];
        vetorElementoKey [3] = vetorElemento [3];
        vetorElementoKey [4] = vetorElemento [4];
        vetorElementoKey [5] = vetorElemento [5];
        vetorElementoKey [6] = vetorElemento [6];
        vetorElementoKey [7] = vetorElemento [7];

        lista = lista + "!!!---Start---------------------------------------!!!\n";
        lista = lista + viewChanceIHSA (keyE);
        lista = lista + "!!!---End-----------------------------------------!!!\n";

// Fim ---- Segundo

// Inicio ---- Terceiro

        lista = lista + "!!!---Start---------------------------------------!!!\n";
        keyE = "B";
        quantidade = 1;
        vetorElementoKey [1] = null;
        vetorElementoKey [2] = null;
        vetorElementoKey [3] = null;
        vetorElementoKey [4] = null;
        vetorElementoKey [5] = null;
        vetorElementoKey [6] = null;
        vetorElementoKey [7] = null;
        lista = lista + queueEDelivery().toString();
        lista = lista + queueEDeliverySort().toString();
        lista = lista + viewE(keyE);
        lista = lista + viewESort(keyE);
        lista = lista + linkMolecular(keyE, quantidade);
        lista = lista + "!!!---End-----------------------------------------!!!\n";

        vetorElementoKey [1] = vetorElemento [1];
        vetorElementoKey [2] = vetorElemento [2];
        vetorElementoKey [3] = vetorElemento [3];
        vetorElementoKey [4] = vetorElemento [4];
        vetorElementoKey [5] = vetorElemento [5];
        vetorElementoKey [6] = vetorElemento [6];
        vetorElementoKey [7] = vetorElemento [7];

        lista = lista + "!!!---Start---------------------------------------!!!\n";
        lista = lista + viewShareHSA ();
        lista = lista + "!!!---End-----------------------------------------!!!\n";

// Fim ---- Terceiro

        mText.setValue(lista);
    }

    public LiveData<String> getText() {
        return mText;
    }
}