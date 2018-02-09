Given estoy en la url http://sahitest.com/demo/training/login.htm
When escribo test en campo TXTUSER
And escribo secret en campo TXTPASS
And doy click en BTNLOGIN
And doy click en la lupa y escribo calculadora imagenes\\lupa.png
And doy click en la imagen resultado imagenes\\calculadora.png
And doy click en el cinco imagenes\\cinco.png
And doy click en el por imagenes\\por.png
And doy click nuevamente en el cinco imagenes\\cinco.png
And doy click en el igual imagenes\\igual.png
And nuevamente doy click en la lupa y escribo cmd imagenes\\lupa.png
And nuevamente doy click en la imagen resultado imagenes\\cmd.png
And escribo el comando taskkill /F /IM calculator.exe
And presiono la tecla enter
Then deberia ver la imagen imagenes\\verificar.png

