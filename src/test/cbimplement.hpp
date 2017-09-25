#ifndef CBIMPLEMENT_HPP
#define CBIMPLEMENT_HPP

#include "engine.hpp"

class CbImplement : public Callback
{
public:
    virtual void call(CbInfo *info);
};

#endif // CBIMPLEMENT_HPP
