#include "engine.hpp"

#include <iostream>

Engine::Engine(Callback *cb)
    : cb_(cb)
{
    std::cout << "engine construct" << std::endl;
}

Engine::~Engine()
{
    std::cout << "engine destruct" << std::endl;
}

void Engine::run()
{
    CbInfo info;
    info.msg_ = "hello world";
    info.usr_ = "jason";
    cb_->call(&info);
}

CbInfo::CbInfo()
{
    std::cout << "callback info construct" << std::endl;
}

CbInfo::~CbInfo()
{
    std::cout << "callback info destruct" << std::endl;
}

std::string *CbInfo::getUsername()
{
    return &usr_;
}

const std::string &CbInfo::getMessage() const
{
    return msg_;
}
