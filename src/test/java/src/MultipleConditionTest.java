package src;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultipleConditionTest {
    MultipleCondition multiple = new MultipleCondition();
    @Test
    public void testAllConditions(){
        Assertions.assertEquals("Special Discount Applied" , multiple.checkConditions(true, true,true,true) );
        Assertions.assertEquals("Special Discount Applied" , multiple.checkConditions(true, true,true,false) );
        Assertions.assertEquals("Special Discount Applied" , multiple.checkConditions(true, true,false,true) );
        Assertions.assertEquals("Special Discount Applied" , multiple.checkConditions(true, true,false,false) );
        Assertions.assertEquals("Special Discount Applied" , multiple.checkConditions(true, false,true,true) );
        Assertions.assertEquals("No Discount" , multiple.checkConditions(true, false,true,false) );
        Assertions.assertEquals("No Discount" , multiple.checkConditions(true, false,false,true) );
        Assertions.assertEquals("No Discount" , multiple.checkConditions(true, false,false,false) );
        Assertions.assertEquals("Special Discount Applied" , multiple.checkConditions(false, true,true,true) );
        Assertions.assertEquals("No Discount" , multiple.checkConditions(false, true,true,false) );
        Assertions.assertEquals("No Discount" , multiple.checkConditions(false, true,false,true) );
        Assertions.assertEquals("No Discount" , multiple.checkConditions(false, true,false,false) );
        Assertions.assertEquals("Special Discount Applied" , multiple.checkConditions(false, false,true,true) );
        Assertions.assertEquals("No Discount" , multiple.checkConditions(false, false,true,false) );
        Assertions.assertEquals("No Discount" , multiple.checkConditions(false, false,false,true) );
        Assertions.assertEquals("No Discount" , multiple.checkConditions(false, false,false,false) );

    }


    /*
    *Para asegurar una cobertura completa de condición múltiple (MC/DC) en el método checkConditions,
    * es necesario probar todas las combinaciones posibles de las condiciones atómicas.
    * Dado que tenemos 4 condiciones independientes (isMember, hasCoupon, isHoliday, isFirstPurchase), el número total de combinaciones posibles es 16.

Cada una de estas condiciones puede ser verdadera o falsa, lo que nos lleva a las siguientes combinaciones:

isMember = false, hasCoupon = false, isHoliday = false, isFirstPurchase = false
isMember = false, hasCoupon = false, isHoliday = false, isFirstPurchase = true
isMember = false, hasCoupon = false, isHoliday = true, isFirstPurchase = false
isMember = false, hasCoupon = false, isHoliday = true, isFirstPurchase = true
isMember = false, hasCoupon = true, isHoliday = false, isFirstPurchase = false
isMember = false, hasCoupon = true, isHoliday = false, isFirstPurchase = true
isMember = false, hasCoupon = true, isHoliday = true, isFirstPurchase = false
isMember = false, hasCoupon = true, isHoliday = true, isFirstPurchase = true
isMember = true, hasCoupon = false, isHoliday = false, isFirstPurchase = false
isMember = true, hasCoupon = false, isHoliday = false, isFirstPurchase = true
isMember = true, hasCoupon = false, isHoliday = true, isFirstPurchase = false
isMember = true, hasCoupon = false, isHoliday = true, isFirstPurchase = true
isMember = true, hasCoupon = true, isHoliday = false, isFirstPurchase = false
isMember = true, hasCoupon = true, isHoliday = false, isFirstPurchase = true
isMember = true, hasCoupon = true, isHoliday = true, isFirstPurchase = false
isMember = true, hasCoupon = true, isHoliday = true, isFirstPurchase = true
*
--------Justificación de la Combinatoria---------------
La combinación de estos tests se justifica para cubrir las siguientes razones:

Cobertura Completa de Decisiones: Cada combinación asegura que todas las posibles rutas de ejecución del código sean probadas.

Validación Independiente de Condiciones: Al probar cada combinación, validamos que cada condición atómica afecte
* el resultado de la decisión de manera independiente.

Detección de Interacciones entre Condiciones: Algunas combinaciones pueden revelar defectos que solo ocurren cuando
* ciertas condiciones se cumplen simultáneamente.

--------------Resultados Esperados---------------------
Para cada combinación, el resultado esperado del método checkConditions es:

"Special Discount Applied": Si (isMember && hasCoupon) || (isHoliday && isFirstPurchase) se evalúa como verdadero.
"No Discount": En cualquier otro caso.
Comentario Final
El diseño de los tests para cubrir todas las combinaciones posibles es crucial en la técnica de condición múltiple,
* ya que asegura que todas las interacciones entre las condiciones sean evaluadas, proporcionando una validación exhaustiva
* del comportamiento del código. Esto es especialmente importante en sistemas críticos donde cualquier fallo debido
* a una combinación no probada de condiciones podría tener consecuencias significativas.
    *
    * */
}
