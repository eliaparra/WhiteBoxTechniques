public class MultipleCondition {
    /**
     * Verifica múltiples condiciones para determinar una acción.
     *
     * @param isMember       Indica si el cliente es miembro.
     * @param hasCoupon      Indica si el cliente tiene un cupón.
     * @param isHoliday      Indica si es un día festivo.
     * @param isFirstPurchase Indica si es la primera compra del cliente.
     * @return El mensaje resultante basado en las condiciones.
     */
    public String checkConditions(boolean isMember, boolean hasCoupon, boolean isHoliday, boolean isFirstPurchase) {
        if ((isMember && hasCoupon) || (isHoliday && isFirstPurchase)) {
            return "Special Discount Applied";
        } else {
            return "No Discount";
        }
    }
}
