#ifndef ENGINE_HPP
#define ENGINE_HPP

#define OK     (1)
#define NOT_OK (0)

#define API_OK       0
#define API_OS_ERROR 1

#include <string>

typedef struct sNCharcb
{
    char * pData;
    int    iDataLen;
} tsNCharcb;

const tsNCharcb JAVA = {(char *)"java", 4};
const tsNCharcb CPP = {(char *)"cpp", 3};

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
    virtual int call(CbInfo *info, int *aiCode) = 0;
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
    tsNCharcb sMessage_;
};

#endif // ENGINE_HPP
