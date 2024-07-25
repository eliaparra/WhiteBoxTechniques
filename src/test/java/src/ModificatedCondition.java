package src;

public class ModificatedCondition {
    /**
     * Calcula el descuento basado en varios factores.
     *
     * @param isMember       Indica si el cliente es miembro.
     * @param hasCoupon      Indica si el cliente tiene un cupón de descuento.
     * @param isHoliday      Indica si la compra se realiza durante un día festivo.
     * @param purchaseAmount Monto de la compra.
     * @return El porcentaje de descuento.
     */
    public double calculateDiscount(boolean isMember, boolean hasCoupon, boolean isHoliday, double purchaseAmount) {
        double discount = 0.0;

        if ((isMember || hasCoupon) && (isHoliday || purchaseAmount > 100)) {
            discount = 0.20;
        } else if (isMember && hasCoupon) {
            discount = 0.15;
        } else if (isMember || hasCoupon) {
            discount = 0.10;
        } else if (isHoliday) {
            discount = 0.05;
        }

        return discount;
    }
}
