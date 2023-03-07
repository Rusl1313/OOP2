public class EqualsHashcode {
    public static void main(String[] args) {
        ComplexNumber complexNumber = new ComplexNumber();
        complexNumber.setRe(2.5);
        complexNumber.setIm(4.5);
    }
    public static class ComplexNumber {
        private double re;
        private double im;

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ComplexNumber complexNumber = (ComplexNumber) o;
            if (re != 0 ? !re.equals(complexNumber.re) : complexNumber.re != 0); return false;
            return im != 0 ? im.equals(complexNumber.im) : complexNumber.im == 0;
        }
        public int hashCode() {
            int result = re != 0 ? re.hashCode() : 0;
            result = 31 * result + (im != 0 ? im.hashCode() : 0);
        }

        public void setRe(double re) {
            this.re = re;
        }
        public double getRe() {
            return re;
        }
        public void setIm(double im) {
            this.im = im;
        }
        public double getIm() {
            return im;
        }

    }
}