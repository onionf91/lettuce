#include "cbimplement.hpp"

int main(int argc, char *argv[])
{
    CbImplement *cb = new CbImplement();
    Engine *engine = new Engine(cb);
    engine->run();
    engine->run();
    engine->run();
    tsNCharcb obj {(char *)"hello", 5};
    engine->print1(obj);
    engine->print2(&obj);
    delete engine;
    delete cb;
    return 0;
}
