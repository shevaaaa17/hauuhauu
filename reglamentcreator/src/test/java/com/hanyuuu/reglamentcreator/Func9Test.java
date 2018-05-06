/**
 * Установка принадлежности к пакету reglament_creator
 */
package com.hanyuuu.reglamentcreator;
/**
 * Импортирование класса, содержащего набор методов сравнения
 */
import static org.junit.Assert.assertEquals;
/**
 * Импортирование основного пакета для тестирования
 */
import org.junit.Test;
/**
 * Импортирование класса программы, подлежащего тестированию
 */
import com.hanyuuu.reglamentcreator.coefficient_func;
public class Func9Test {

	@Test
	public void test() {
		/**
		 * Входными данными является метод, выводящий результат расчета коэффициента регламента
		 * и предполагаемый результат данного расчета.
		 * Предполагается, что программой будет произведен расчет коэффициента регламента 
		 * по формуле x=a*1+b*2+b*3, где
		 * a – Количество символов в регламенте уровня 1
		 * b – Количество символов в регламенте уровня 2
		 * c – Количество символов в регламенте уровня 3
		 * Программе на вход даются 3 элемента регламента со следующими количествами символов
		 * на соответствующих уровнях: 1140, 1104, 868.
		 * Ожидается, что будет произведен следующий расчет: (1140*1+1104*2+868*3) и возвращено значение 5952
		 */
		/**
		 * Инициализация тестируемого класса
		 */
		coefficient_func a = new coefficient_func();
		/**
		 * Сравнение рассчитанного и ожидаемого значения
		 */
		assertEquals(a.takeSum(1140, 1104, 868),5952);
	}

}
