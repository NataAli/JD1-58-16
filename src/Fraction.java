public class Fraction {

        private int ch;// поле экземпляра класса = поле объекта
        private int zn;

        public Fraction() { // - конструктор без параметров
        }

        public Fraction(int ch, int zn) {
            this.zn = zn;
            this.ch = ch;
        }

        public int getCh() {
            return ch;
        }

        public void setCh(int ch) {
            this.ch = ch;
        }

        public int getZn() {
            return zn;
        }

        public void setZn(int zn) {
            this.zn = zn;
        }

        public static void main(String[] args){
            Fraction f = new Fraction(7,2);
            int i = f.integPart();
            System.out.println("Целая часть дроби: "+i);
        }

        public boolean isSimple() {
            if (commonDivisor() == 1) {
                return true;
            } else {
                return false;
            }
        }

        public Fraction add(Fraction f){
            // 1
            // ch, zn
            // f.ch, f.zn
            // f1.add(f2);
            int newZn;
            int newCh;
            newZn = zn * f.zn;
            newCh = ch*f.zn + zn * f.ch;
            return new Fraction(newCh, newZn);
        }

        public void pow(int value){
            ch = (int) Math.pow(ch, value);
            zn = (int) Math.pow(zn, value);
        }

        private int commonDivisor() {
            int nod = 1;
            int min;
            if (ch > zn) {
                min = zn;
            } else {
                min = ch;
            }

            for (int i = min; i > 0; i--) {
                if ((ch % i == 0) && (zn % i == 0)) {
                    nod = i;
                    break;
                }
            }
           return nod;
        }

        private int integPart(){
            int i = 0;
            while (ch >= zn){
                ch = ch - zn;
                i++;
            }
            return i;
        }
}
