package swiprePac;

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

class Scroll {
	@Keyword
	def horizontalScroll(TestObject toGrid, TestObject toTarget) {
		// Fetching the x, y, width, and height attributes of the grid
		int x = Integer.parseInt(Mobile.getAttribute(toGrid, 'x', 10))
		int y = Integer.parseInt(Mobile.getAttribute(toGrid, 'y', 10))
		int xWidth = Integer.parseInt(Mobile.getAttribute(toGrid, 'width', 10))
		int newXWidth = x + xWidth / 2 // Center x-coordinate of the grid
		int yHeight = Integer.parseInt(Mobile.getAttribute(toGrid, 'height', 10))
		int newYHeight = y + yHeight / 2 // Center y-coordinate of the grid

		println("Value of X: $x")
		println("Value of Y: $y")
		println("Value of New X Width: $newXWidth")
		println("Value of Y Height: $newYHeight")


		// Iterating to perform the swipe and find the target element   (int i = 1; i <= 10; i++) Mohit
		for (int i = 0; i = 2; i++) {
			// Fixed loop condition
			Mobile.swipe(newXWidth, newYHeight, 10, newYHeight) // Swipe from center to left and to swipe smooth decrease the value of endX

			try {
				boolean isVisible = Mobile.verifyElementVisible(toTarget, 2)

				if (isVisible) {
					println("Targeted Element found")
					break
				}
			} catch (Exception e) {
				println("Error during element verification: ${e.message}")
			}
		}
	}
}
