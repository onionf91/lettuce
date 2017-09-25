#include "engine.hpp"

#include <iostream>

std::string message = "hello word";
CbInfo *info;

Engine::Engine(Callback *cb)
    : cb_(cb)
{
    info = new CbInfo();
    std::cout << "engine construct" << std::endl;
}

Engine::~Engine()
{
    delete info;
    std::cout << "engine destruct" << std::endl;
}

void Engine::run()
{
    cb_->call(info);
}

const std::string &CbInfo::getMessage() const
{
    return message;
}
