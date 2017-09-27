#include "engine.hpp"

#include <iostream>

bool flag;

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
    int aiCode = -1;
    info.msg_ = "change the world";
    info.usr_ = "jason";
    if (flag) {
        flag = false;
        info.sMessage_ = JAVA;
    }
    else {
        flag = true;
        info.sMessage_ = CPP;
    }
    int result = cb_->call(&info, &aiCode);
    std::cout << "callback result : " << result
              << ", ai code : "       << aiCode << std::endl;
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
