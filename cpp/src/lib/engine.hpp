#ifndef ENGINE_HPP
#define ENGINE_HPP

#include <string>

class Engine;
class Callback;
class CbInfo;

class Engine
{
    Callback *cb_;

public:
    Engine(Callback *cb);
    ~Engine();
    void run();
};

class Callback
{
public:
    virtual void call(CbInfo *info) = 0;
};

class CbInfo
{
public:
    CbInfo();
    ~CbInfo();
    std::string msg_;
    std::string usr_;
    std::string *getUsername();
    const std::string &getMessage() const;
};

#endif // ENGINE_HPP
