#include <iostream>
using namespace std;

int main (int argc, char * argv [])
{
int var1 = 123; // ����������� ����� var1 ������ 123
int var2 = 99; // ����������� ����� var2 ������ 99
int * Ptrvar1 = & var1; // �������� �� ����� var1
int * Ptrvar2 = & var2; // �������� �� ����� var2
cout << "var1 =" << var1 << endl;
cout << "var2 =" << var2 << endl;
cout << "ptrvar1 =" << Ptrvar1 << endl;
cout << "ptrvar2 =" << Ptrvar2 << endl;
if (Ptrvar1> Ptrvar2) // ��������� �������� ���������, ����� ������ ������
cout << "ptrvar1> ptrvar2" << endl;
if (* Ptrvar1> * Ptrvar2) // ��������� �������� ������, �� �� ����������� ���������
cout << "* ptrvar1> * ptrvar2" << endl;
//system ("pause");
return 0;
}
