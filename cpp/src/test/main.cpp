#include "cbimplement.hpp"

int main(int argc, char *argv[])
{
    CbImplement *cb = new CbImplement();
    Engine *engine = new Engine(cb);
    engine->run();
    engine->run();
    engine->run();
    delete engine;
    delete cb;
    return 0;
}
