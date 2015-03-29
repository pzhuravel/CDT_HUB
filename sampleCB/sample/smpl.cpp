#include <iostream>
using namespace std;

int main (int argc, char * argv [])
{
int var1 = 123; // Ініціалізація змінної var1 числом 123
int var2 = 99; // Ініціалізація змінної var2 числом 99
int * Ptrvar1 = & var1; // Вказівник на змінну var1
int * Ptrvar2 = & var2; // Вказівник на змінну var2
cout << "var1 =" << var1 << endl;
cout << "var2 =" << var2 << endl;
cout << "ptrvar1 =" << Ptrvar1 << endl;
cout << "ptrvar2 =" << Ptrvar2 << endl;
if (Ptrvar1> Ptrvar2) // порівнюємо значення вказівників, тобто адреси змінних
cout << "ptrvar1> ptrvar2" << endl;
if (* Ptrvar1> * Ptrvar2) // порівнюємо значення змінних, на які посилаються вказівники
cout << "* ptrvar1> * ptrvar2" << endl;
//system ("pause");
return 0;
}
