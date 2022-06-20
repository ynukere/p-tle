class Main {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++){ //Do pętli for wpisujemy początkowy stan licznika (0) potem piszemy w którym momencie licznik ma się zatrzymać i na końcu czy wartość ma rosnąć czy maleć (możemy np zwiększać wartość o 2 więc i += 2)
      System.out.println(i);
    }
    int j = 10;
    while (j <= 15){ //wyswietla dopoki niespelniony warunek
      System.out.println(j);
      j++;
    }
    int k = 9;
    do { //wyswietla a nastepnie sprawdza warunek
      System.out.println(k);
      k++;
    }
      while (k < 15);
  };
  for (int z = 0; z<10; z++){//Pętla for z przerwą (continue pominięcie)
  if (z==4){
    break;
  }
  System.out.println(z);
  }
}