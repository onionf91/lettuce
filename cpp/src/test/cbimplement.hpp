#ifndef CBIMPLEMENT_HPP
#define CBIMPLEMENT_HPP

#include "engine.hpp"

class CbImplement : public Callback
{
public:
    virtual int call(CbInfo *info, int *aiCode);
};

#endif // CBIMPLEMENT_HPP
