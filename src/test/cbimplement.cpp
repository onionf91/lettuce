#include "cbimplement.hpp"

#include <iostream>

void CbImplement::call(CbInfo *info)
{
    std::cout << info->getMessage() << std::endl;
}
