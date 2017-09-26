#include "engine.hpp"

void cleanup(Engine *engine) {
    delete engine;
}

void cleanup(Callback *cb) {
    delete cb;
}
