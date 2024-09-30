 class ChocolateShop {
    public static void main(String[] args) {
        int money = 15; // Имеющиеся деньги
        int price = 1;  // Цена за шоколадку
        int wrap = 3;   // Количество оберток, нужное для одной бесплатной шоколадки

        // Количество купленных шоколадок
        int chocolates = money / price;
        int wrappers = chocolates;

        // Обмен оберток на шоколадки
        while (wrappers >= wrap) {
            int freeChocolates = wrappers / wrap;
            chocolates += freeChocolates;
            wrappers = wrappers % wrap + freeChocolates;
        }

        System.out.println("Максимальное количество шоколадок: " + chocolates);
    }
}