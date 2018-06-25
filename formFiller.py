#! python3

import pyautogui, time



try:
	for _ in range(4):
		time.sleep(3)
		print('ctrl-c to quit')
		pyautogui.click(544,315)
		pyautogui.typewrite("123 test boi")
		time.sleep(1)
		pyautogui.hotkey('tab')
		time.sleep(1)
		pyautogui.typewrite("nothing")
		time.sleep(1)	
		pyautogui.hotkey('tab')
		time.sleep(1)
		for _ in range(8):
			pyautogui.hotkey('down')
		pyautogui.hotkey('enter')
		time.sleep(1)
		pyautogui.hotkey('tab')
		time.sleep(1)
		pyautogui.hotkey('tab')
		time.sleep(1)
		pyautogui.typewrite("sup")
		time.sleep(1)
		pyautogui.hotkey('tab', 'enter')
		pyautogui.doubleClick(657,226) 
		pyautogui.moveTo(657,225,duration=0.5)
		pyautogui.doubleClick(657,226) 
except KeyboardInterrupt:
	print('Done')
