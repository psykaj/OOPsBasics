#include <iostream>
using namespace std;

//virtual function in cpp

class base {
    public:
    virtual void print()
    {
        cout<<"Printing base class"<<endl;
    }
    
    void show()
    {
        cout<<"Showing base class"<<endl;
    }
};

class derived : public base {
    public:
    void print()
    {
        cout<<"Printing derived class"<<endl;
    }
    
    void show()
    {
        cout<<"Showing derived class"<<endl;
    }
};

int main()
{
    //pointer of a base class
    base *b;
    
    derived d;
    
    //base class pointer contains the address of derived class
    b = &d;
    
    // Virtual function, binded at runtime
    b->print();
    
    // Non-virtual function, binded at compile time
    b->show();
    
    return 0;
}
